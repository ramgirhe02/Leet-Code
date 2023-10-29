class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> map = new HashSet<>();
        int count=0;
        for(int i = 0 ; i<words.length;i++){

            char [] ch =words[i].toCharArray();
             Arrays.sort(ch);
            if(!map.add(new String(ch)))count++;
        }
        return count;
    }
}