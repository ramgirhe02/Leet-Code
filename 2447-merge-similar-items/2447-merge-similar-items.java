class Solution {
    public void mergeMap(int [][]items,Map<Integer,Integer>map){
        for(int[]item:items){
            int val=item[0];
            int weight=item[1];
            map.put(val,map.getOrDefault(val,0)+weight);
        }
    }
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans=new ArrayList<>();
        Map<Integer,Integer>map=new TreeMap<>();
        mergeMap(items1,map);
        mergeMap(items2,map);
        for(Integer val: map.keySet()){
            List<Integer> temp=new ArrayList<>();
            temp.add(val);
            temp.add(map.get(val));
            ans.add(temp);
        }
        return ans;
    }
}