class Solution {
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int preffix_product=1;
        int suffix_product=1;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(preffix_product==0){
                preffix_product=1;
            }
            if(suffix_product==0){
                suffix_product=1;
            }
            preffix_product*=nums[i];
            suffix_product*=nums[n-i-1];
            ans=Math.max(ans,Math.max(preffix_product,suffix_product));
        }
        return ans;

    }
}