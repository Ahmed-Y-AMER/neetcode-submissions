class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int longestSeqLen = 0, secondLongestSeqLen = 0, currentVal;

        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i] - 1)){
                currentVal = nums[i];
                secondLongestSeqLen = 1;
                while(true){
                    if(set.contains(currentVal+1)){
                        currentVal++;
                        secondLongestSeqLen++;
                        continue;
                    }
                    longestSeqLen = Math.max(secondLongestSeqLen, longestSeqLen);
                    break;
                }
            }
        }
        return longestSeqLen;
    }
}
