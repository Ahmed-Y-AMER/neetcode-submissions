class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = totalArrProduct(nums);
        int zerosCount = 0;

        for (int num : nums) {
            zerosCount += num == 0 ? 1 : 0;
            if(zerosCount > 1)
                return new int[nums.length];
        }

        for (int i = 0; i < nums.length; i++) {
            if(zerosCount == 1 && nums[i] != 0){
                nums[i] = 0;
                continue;
            }
            nums[i] = product / (nums[i] == 0 ? 1 : nums[i]);
        }
        return nums;
    }

    public int totalArrProduct(int [] nums){
        int product = 1;
        for(int num : nums)
            product *= num == 0 ? 1 : num;
        return product;
    }
}  
