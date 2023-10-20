class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        else{
            int index=1;
            int a=0;
            for(int i=1;i<n;i++){
                if(nums[i]==nums[i-1]){
                    a++;
                    //nums[a]=nums[i];
                }
                else a=0;
                if(a==0){
                    nums[index]=nums[i];
                    index++;
                }
            }
            return index;
        } 
    }
}