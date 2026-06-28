class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum=0;
        int rightsum=0;
        int right_index=cardPoints.length-1;
        for(int i=0;i<k;i++){
            leftsum=leftsum+cardPoints[i];
        }
        int max_sum=leftsum;
        for(int i=k-1;i>=0;i--){
            leftsum=leftsum-cardPoints[i];
            rightsum=rightsum+cardPoints[right_index];
            right_index--;
            max_sum=Math.max(max_sum,leftsum+rightsum);
        }
        return max_sum;
    }
}