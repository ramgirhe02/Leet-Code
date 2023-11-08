class Solution {
    public int minimumOperations(int[] nums) {
        // Arrays.sort(nums);
        Set<Integer> s =new HashSet<>();
        //  Arrays.stream(nums).collect(Collectors.toSet());
        for(int i : nums){
            if(i==0)continue;
            s.add(i);
        }
    //     int count = 0;
    //     int max = nums[nums.length-1];
    //    for(Integer i : s){
    //         max-=i;
    //         count++;
    //         if(max<=0){
    //         //  System.out.println(count);
    //             return count;
    //         }
    //         // System.out.println(count);
    //         // System.out.println("max"+max);
    //     }
        return s.size();
    }
}