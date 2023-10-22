class Solution {
    public int countAsterisks(String s) {
        int count = 0 , ascount = 0;
        for(int i = 0; i<s.length() ; i++){
            if(count%2==0){
                if(s.charAt(i) == '*')
                    ascount++;
            }
            if(s.charAt(i) == '|')
                    count++;
        }
        //System.out.println(ascount);
       return ascount; 
    }
}