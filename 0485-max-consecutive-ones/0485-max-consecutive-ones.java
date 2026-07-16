class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_count=0;
        int count=0;
        for(int num : nums){
            if(num==1){
                count++;
            }
            else{
                count=0;
            }
            max_count=Math.max(count,max_count);
        }
        return max_count;
    }
}