class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
        }

        List<Integer> sortedKeys = map.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue())) // Sort by value (frequency) descending
                .map(Map.Entry::getKey)                                // Extract only the key
                .collect(Collectors.toList());
        List<Integer> topK = sortedKeys.subList(0, k);

        int[] result = topK.stream().mapToInt(i -> i).toArray(); // Unboxes Integer to int.toArray();
        return result;
    }
}
