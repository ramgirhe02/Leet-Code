class Solution {
    public String longestCommonPrefix(String[] strs) {
    

      Arrays.sort(strs);
        String st1 = strs[0];
        String st2 = strs[strs.length-1];
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i<st1.length();i++){
            if(st1 != null)
            if(!((st1.charAt(i) == st2.charAt(i))))
                break;
                sb.append(st1.charAt(i));
        }
        return sb.toString();
    }
}