class Solution {
    public int maxArea(int[] height) {
        int max_area=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int width=right-left;

            int height_of_container=Math.min(height[left],height[right]);
            int area=width*height_of_container;
            max_area=Math.max(max_area,area);
            if(height[left]<height[right]){
                left++;
            }
            else{ 
                right--;
            }
           
           
        }
    return max_area;
  }
}