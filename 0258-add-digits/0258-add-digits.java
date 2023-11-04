class Solution {
    public int addDigits(int num) {
        // if(num==0)return 1;
        // while()
        // if(num<10)
        //     return num;
        // int x = (num%10)+(num/10);
        // return addDigits(x);
        return num<10 ? num : addDigits((num%10)+(num/10));
    }
}