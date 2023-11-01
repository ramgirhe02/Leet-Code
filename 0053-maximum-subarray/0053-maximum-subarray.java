class Solution {
    //kaden alogo
    public int maxSubArray(int[] nums) {
        // if(nums.length==1)return nums[0];
        int max = Integer.MIN_VALUE,cursum = 0;
        for(int i = 0 ; i<nums.length;i++){
            cursum = cursum+ nums[i];
            if(cursum>max) max=cursum;
            if(cursum<0)cursum=0;
        }
        return max;
    }
}