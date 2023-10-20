class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int [] arr = {-1,-1};
        boolean flag1=true,flag2=true;
        // if(nums.length<=1)
        //     return arr;
        while(start<=end && (flag1 || flag2)){
            if(flag1 && nums[start]==target ){
                arr[0]=start;
                flag1=false;
            }
            if(flag2 && nums[end]==target ){
                arr[1]=end;
                flag2=false;
            }
            if(flag1)
                start++;
            if(flag2)
                end--;
        }
        return arr;
    }
}