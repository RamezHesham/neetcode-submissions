class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Create the HashMap and count frequencies
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            // Using getOrDefault is the cleanest "Java way"
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // 2. Move the entries into a List so we can sort them
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(counts.entrySet());

        // 3. Sort the list by Value (frequency) in descending order
        // (b, a) makes it descending (highest frequency first)
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // 4. Extract the top 'k' keys into the result array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}