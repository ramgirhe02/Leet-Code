class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        for(int i = 1 ; i <= nums.length ; i++ ){
            if(nums.length % i == 0){
                sum= sum+(nums[i-1] * nums[i-1]);
            }
        }
        System.gc();
        return sum;
    }
}
