class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max_sum = sum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            max_sum = Math.max(max_sum, sum);
        }

        return (double) max_sum / k;
    }
}