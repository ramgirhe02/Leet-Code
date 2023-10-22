class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char i='a' ;i<='z';i++){
            if(sentence.indexOf(i)<0)
                return false;
        }
        return true;
    }
}
    //     Map<Character,Integer> map = new HashMap<>();
    //     for(int i = 0 ; i<sentence.length();i++){
    //         map.put(sentence.charAt(i),map.getOrDefault(sentence.charAt(i),0)+1);
    //         // if(map.get(sentence.charAt(i))>2)return false;
    //     }
    //     // System.out.println(map);
    //     if(map.size()<26)
    //         return false;
    //     return true;
    // }
// }