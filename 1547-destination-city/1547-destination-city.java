class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new LinkedHashSet<>();
        for(List<String> path : paths){
            set.add(path.get(0));
        }
        //System.out.println(set);
        for(List<String> path : paths){
            if(!set.contains(path.get(1))){
                return path.get(1);
            }
        }
        return null;
    }
}
// class Solution {
//     public String destCity(List<List<String>> paths) {
//         HashMap<String,String> map = new HashMap<>();
//         for(int i = 0 ; i< paths.size();i++){
//             map.put(paths.get(i).get(0),paths.get(i).get(1));
//         }
//         String result = null;
//         for(String s : map.keySet()){
//             while(map.containsKey(map.get(s))){
//                 s=map.get(s);
//                 result = map.get(s);
//             }
//             if(result == null)result=map.get(s);
//         }
//         //System.out.println(map);
//         return result;
//     }
// }