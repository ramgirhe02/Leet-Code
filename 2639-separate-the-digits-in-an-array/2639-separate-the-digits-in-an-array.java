class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0 ; i<nums.length;i++){
                StringBuilder sb = new StringBuilder(nums[i]+"");
                for(int j = 0 ;j<sb.length();j++){
                    list.add(Integer.parseInt(sb.charAt(j)+""));
                }
            }
        int [] arr = new int [list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        // System.out.println(list);
        return arr;
    }
    
}