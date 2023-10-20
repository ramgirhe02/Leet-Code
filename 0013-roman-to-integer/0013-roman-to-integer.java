class Solution {
    public static int convert(Character c){
          switch (c) {
                case 'I': return 1;
                case 'V': return 5;
                case 'X' : return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
            }
            return -1;
    }
    public int romanToInt(String s) {

       int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(i == s.length()-1)
             result += convert(c);
             else if(convert(s.charAt(i)) >= convert(s.charAt(i+1)))
             result += convert(c);
            else {
            result += convert(s.charAt(i+1)) - convert(s.charAt(i));
            i++ ;
            }
          
        }
        return result;
    }
    
}