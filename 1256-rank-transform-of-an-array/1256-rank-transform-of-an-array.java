class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int arrr[] = arr.clone();
        Arrays.sort(arrr);
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<arrr.length;i++){
            if(!map.containsKey​(arrr[i]))
                map.put(arrr[i],count++);
        }
        for(int j=0;j<arr.length;j++){
            arr[j]=map.get(arr[j])+1;
        }
        return arr;

        // List<Integer> list = new ArrayList<>();
        // for(int i = 0 ; i<arr.length;i++){
        //     if(!list.contains​(arr[i]))
        //     list.add(arr[i]);
        // }
        // Collections.sort(list);
        // for(int j=0;j<arr.length;j++){
        //     arr[j]=list.indexOf(arr[j])+1;
        // }
        // // System.out.println(list);
        // return arr;
    }
}