// class Solution {
//     public long countOperationsToEmptyArray(int[] nums) {
//         List<Integer> list = new ArrayList<>();
//             for(int i: nums){
//                 list.add(i);
//             }
//         Arrays.sort(nums);
//         long count = 0;
//         int index=0,temp =0;
//         while(!list.isEmpty()){
//          if(list.get(0) == nums[index]){
//                 list.remove(0);
//                 index++;
//          }  
//             else{
//                 temp = list.get(0);
//                 list.remove(0);
//                 list.add(temp);
//             }
//             count++;
//         }
//         return count;
//     }
// }

class Solution {
    public long countOperationsToEmptyArray(int[] nums){
        Map<Integer, Integer> nm = new HashMap<>();
        int n=nums.length,val=0;
        long ans=n;
        for(int i=0;i<n;i++)
        {
            nm.put(nums[i],i);
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if(nm.get(nums[i])<val)
            {
                ans+=n-i;
            }
            val=nm.get(nums[i]);
        }   
        return ans;
    }
}