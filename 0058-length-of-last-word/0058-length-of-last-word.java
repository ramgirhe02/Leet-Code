class Solution {
    public int lengthOfLastWord(String s) {
       
        int j=0;
        boolean flag = false;
        for(int i = s.length()-1 ; i>=0 ; i--){
            char ch = s.charAt(i);
           if(Character.isLetter(ch)){
            j++;
            flag = true;
           }
          if(ch == ' ' && flag)
                break;
                  
        }

    return j;
    }
}