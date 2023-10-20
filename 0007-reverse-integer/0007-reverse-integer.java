// class Solution {
//     public int reverse(int x) {
//       int a =Math.abs(x);
//       int sum =0;
//       while(a>0){
//           int num = a%10;
//           sum=sum*10+num;
//           a=a/10;
//       }
//       return x<0?-sum:sum;
//     }
// }
class Solution {
    public int reverse(int x) {
        long finalNum = 0;
        while(x!=0){
            int lastDig = x%10;
            finalNum += lastDig;
            finalNum = finalNum*10;
            x= x/10;
        }
        finalNum = finalNum/10;
        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*finalNum);
        }
        return (int)finalNum;
    }
}


// class Solution {
//     public int reverse(int x) {
//         if(x==0)
//             return 0;
//         String ss = Integer.toString(x);
//         StringBuilder sb = new StringBuilder();
//         boolean flag = true,flag1=false;
//         for(int i = ss.length()-1 ; i>=0;i--){
//             if(flag && ss.charAt(i)=='0'){
//                 continue;
//             }
//             if(Character.isDigit(ss.charAt(i))){
//                 sb.append(ss.charAt(i));
//                 flag = false;
//             }
//             if(ss.charAt(i)=='-'){
//                 flag1 = true ;
//             }
//         }
//         if(flag1){
//             return (-Integer.parseInt(sb.toString()));
//         }
//         return Integer.parseInt(sb.toString());
//     }
// }