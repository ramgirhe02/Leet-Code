class Solution {
    public boolean isIsomorphic(String str1, String str2) {
        HashMap<Character, Character> mapping = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);
            
            if (mapping.containsKey(char1)) {
                if (mapping.get(char1) != char2) {
                    return false; 
                }
            } else {
                if (mapping.containsValue(char2)) {
                    return false;
                }
                mapping.put(char1, char2);
            }
        }
        
        return true;

    }
}