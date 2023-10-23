class Solution {
    public int maxArea(int[] height) {
        int maxarea=Integer.MIN_VALUE;
        int start = 0 ,end = height.length;
        while(start<end){
            int min = Math.min(height[start],height[end-1]);
            // System.out.println(min*(end-1));
            maxarea=Math.max(maxarea,(min*(end-start-1)));
            if(height[start]<height[end-1])
                start++;
            else end--;
        }
        return maxarea;
    }
}