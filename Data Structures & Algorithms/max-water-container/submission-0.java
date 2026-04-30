class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1, maxArea = 0, currentArea = 0;

        while(right > left){
            currentArea = (right - left) * Math.min(heights[left], heights[right]);
            maxArea = Math.max(currentArea, maxArea);

            if(heights[left] > heights[right])
                right--;
            else if(heights[left] < heights[right])
                left++;
            else{
                try{
                    if(heights[left+1] > heights[right-1])
                        left++;
                    else
                        right--;
                }catch (ArrayIndexOutOfBoundsException e){
                    return maxArea;
                }
            }
        }

        return maxArea;
    }
}
