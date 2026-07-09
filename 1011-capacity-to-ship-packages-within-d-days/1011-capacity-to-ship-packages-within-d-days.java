class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        int total_weight=0;
        int max_weight=0;
        
        for(int weight : weights){
            total_weight=total_weight+weight;
            max_weight=Math.max(max_weight,weight);
        }
        low=max_weight;
        high=total_weight;
        while(low<=high){
            int mid=low+(high-low)/2;
            int required_days=1;
            int current_load=0;
            for(int w : weights){
                if(current_load+w<=mid){
                    current_load+=w;
                }
                else{
                    required_days=required_days+1;
                    current_load=w;
                }
            }
            if(required_days<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }  
}