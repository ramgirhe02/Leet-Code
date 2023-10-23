// class Solution {
//     public boolean isPowerOfFour(int n) {
//         // int a = 4;
//         // if(n==1)return true;
//         // while(true){
//         //     if(n==a)return true;
//         //     a=a*4;
//         //     if(n<a)return false;
//         //     // if(n<4)return false;
//         // }
        
//     }
// }
public class Solution {
    public boolean isPowerOfFour(int n) {
        for (int i = 0; i <= 15; i++) {
            int powerOfFour = (int) Math.pow(4, i);
            if (powerOfFour == n)
                return true;
            if (powerOfFour > n)
                return false;
        }
        return false;
    }
}