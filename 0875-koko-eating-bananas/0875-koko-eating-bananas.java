class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxpiles=0;
        for(int pile: piles){
            maxpiles=Math.max(maxpiles,pile);
        }
        int low=1;
        int high=maxpiles;
        int ans=maxpiles;
        while(low<=high){
                int mid=low+(high-low)/2;
                long hours=0;
                for(int pile: piles){
                    hours=hours+(pile+mid-1)/mid;
                } 
                if(hours<=h){
                    ans=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }   
        }
        return ans;
    }
}