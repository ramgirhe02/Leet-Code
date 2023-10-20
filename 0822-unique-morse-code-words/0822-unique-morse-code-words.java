class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String [] ss = new String []{".-","-...","-.-.","-..",".","..-.","--.",
            "....","..",".---","-.-",".-..","--","-.","---",".--.",
            "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            HashSet<String> set = new HashSet<>();
            for(String s : words){
                StringBuilder sb = new StringBuilder();
                for(int i = 0 ; i<s.length();i++){
                    sb.append(ss[s.charAt(i)-97]);
                }
                set.add(sb.toString());
            }
            return set.size();
    }
}