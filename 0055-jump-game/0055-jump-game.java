// class Solution {
//     public boolean canJump(int[] nums) {
//         if(nums.length == 1)
//             return true;
//             int n = nums[0];
//             for(int i = 0 ; i<nums.length ;i++){
//                if(i<n){
//                 continue;}

//                 if(n==nums.length-1)
//                     return true;
//                 n=nums[i];
//                 if(n==0)
//                 return false;
//             }
//         for(int a : nums){
//             if(a==0)
//                 return false;
//         }
//      return true;   
//     }
// }
class Solution {
    public boolean canJump(int[] nums) {
       int reachable = 0;
       for(int i = 0; i < nums.length; i ++) {
           if(i > reachable) return false;
           reachable = Math.max(reachable, i + nums[i]);
       } 
       return true;
    }
}