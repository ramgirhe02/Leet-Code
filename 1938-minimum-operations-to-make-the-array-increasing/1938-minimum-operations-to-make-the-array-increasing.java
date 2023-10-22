class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        for(int i = 1 ; i<nums.length ;i ++){
            // if(nums[i-1]<nums[i])continue;
            // else{
                if(!(nums[i-1]<nums[i])){
                    count+=(nums[i-1]-nums[i])+1;
                    nums[i]=nums[i-1]+1;
                }
                // while(!(nums[i-1]<nums[i])){
                //     nums[i]++;
                //     count++;
                // }
            // }

        }
        return count;
    }
}