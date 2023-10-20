class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<>();
        Map<String,Integer> mapp = new HashMap<>();
        // new TreeMap<>((a,b)->{
        //     return (map.get(a)-map.get(b));
        // });
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        
        for(int j=0;j<list2.length;j++){
            if(map.containsKey(list2[j]) )
                mapp.put(list2[j],map.get(list2[j])+j);
        }
        int minn=Collections.min(mapp.values());
         //System.out.println(minn);
         map = new HashMap<>();
        for(String s : mapp.keySet()){
            if((mapp.get(s)==minn))map.put(s,0);
        }
        //System.out.println(mapp);
        //System.out.println(map);
        return map.keySet().toArray(new String[0]);

    }
}