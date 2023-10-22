class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        for(int i = 1 ; i<nums.length+1;i++){
            if((nums.length % i) == 0){
                // System.out.println(sum);
                sum+=(nums[i-1]*nums[i-1]);
                // System.out.println(sum);
            }
        }
        return sum;
    }
}