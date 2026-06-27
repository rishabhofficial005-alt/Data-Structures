class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        int max_sum=sum;
        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i];
            sum=sum-nums[i-k];
            max_sum=Math.max(sum,max_sum);
        }
        return (double)max_sum/k;
    }
}