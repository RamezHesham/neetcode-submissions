class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;   // Fix 3

            int left = i + 1;                               // Fix 1
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum > 0) {                              // Fix 4
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    results.add(Arrays.asList(nums[i], nums[left], nums[right])); // Fix 6
                    left++;
                    right--;
                    while (left < right && nums[left]  == nums[left-1])  left++;  // Fix 5
                    while (left < right && nums[right] == nums[right+1]) right--;
                }
            }
        }
        return results;                                     // Fix 2 (type)
    }
}
