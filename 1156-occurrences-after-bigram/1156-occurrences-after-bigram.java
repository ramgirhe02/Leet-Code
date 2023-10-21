class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String []  ss =  text.split(" ");
        ArrayList<String> list = new ArrayList<>();

        // int count = 0;
        for(int i = 2 ;i<ss.length;i++){
            if(ss[i-2].equals(first) && ss[i-1].equals(second))
                list.add(ss[i]);
        }
    //    String [] s=new String [count];
    //    for(int i = 0 ; i<count;i++)
    //         s[i]=ss[i];
    //l.toArray(new String[0]);
        return list.toArray(new String[0]);
    }
}