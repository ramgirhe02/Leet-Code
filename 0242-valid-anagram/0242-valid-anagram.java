class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char [] ss=s.toCharArray();
        char [] tt=t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        // int count = 0;
        // while(count<s.length()){
        //     if(ss[count]!=tt[count++]){
        //         return false;
        //     }
        // }
        return new String(ss).equals(new String(tt));

    }
}