class Solution {
    public int maxArea(int[] height) {
        int maxarea=Integer.MIN_VALUE;
        int start = 0 ,end = height.length-1;
        while(start<end){
           // int min = Math.min(height[start],height[end-1]);
            maxarea=Math.max(maxarea,(Math.min(height[start],height[end])*(end-start)));
            if(height[start]<height[end])
                start++;
            else end--;
        }
        return maxarea;
    }
}