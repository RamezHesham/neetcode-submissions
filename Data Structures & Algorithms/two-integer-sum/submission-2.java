class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> h = new HashMap<>();
        for(int i =0; i <nums.length;i++){
            int needed = target - nums[i];
            if (h.containsKey(needed)){
                return new int [] {h.get(needed),i};
            }
            h.put(nums[i],i);
        }
        return new int[]{};
    }
}
