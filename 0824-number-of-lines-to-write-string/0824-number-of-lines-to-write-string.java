class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum = 0,count=1;
        for(int i = 0 ; i<s.length();i++){
            int temp=widths[s.charAt(i)-97];
            if(temp+sum>100){
               sum= 0;//sum==100?0:widths[s.charAt(i)-97];
                count++;
            }
            sum+=temp;
        }
        return new int[]{count,sum};
    }
}