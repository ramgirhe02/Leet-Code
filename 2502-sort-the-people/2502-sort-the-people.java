class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> tree = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<heights.length;i++){
            tree.put(heights[i],names[i]);
        }
        int count=0;
        // for(Map.Entry<Integer,String>map : tree.entrySet()){
            for(String values : tree.values()){
            // names[count++]=map.getValue();
            names[count++]=values;
        }
        return names;
    }
}