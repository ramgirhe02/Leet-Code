class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int x=ruleKey.equals("type")?0:ruleKey.equals("color")?1:2;
        int count =0;
        for(int i = 0 ; i<items.size();i++){
            // for(int j=0;j<items.get(i).size();j++){
                if(ruleValue.equals(items.get(i).get(x)))
                    count++;
            // }
        }
        //5ms 96.84 System.out.println(x);
        return count;
    }
}