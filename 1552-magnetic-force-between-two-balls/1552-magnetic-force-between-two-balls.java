class Solution {
    public int maxDistance(int[] position, int m) {
      Arrays.sort(position);
      int low=0;
      int max_distance=0;
      for(int nums: position){
        max_distance=Math.max(max_distance,nums);
      }
      int high=max_distance;
      while(low<=high){
        int mid=low+(high-low)/2;
        int current_balls=1;
        int currently_placed=position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-currently_placed>=mid){
                currently_placed=position[i];
                current_balls++;
            }
        }
        if(current_balls>=m){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
      }
      return high;  
    }
}