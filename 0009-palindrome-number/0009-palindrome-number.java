class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int key = x;
        while(x!=0){
            int val = x%10;
            sum = sum*10+val;
            x= x/10;
            
        }
        // System.out.println(key);
        // System.out.println(sum);
        if(sum<0)
        return false;
        if(sum==key)
        return true;
        return false;
    }
}