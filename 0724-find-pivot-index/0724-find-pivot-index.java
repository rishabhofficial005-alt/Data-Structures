class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int left_sum=0;
            for(int j=0;j<i;j++){
                left_sum+=nums[j];
            }
            int right_sum=0;
            for(int k=i+1;k<nums.length;k++){
                right_sum+=nums[k];
            }
            if(left_sum==right_sum){
                return i;
            }
        }
        return -1;
    }
}