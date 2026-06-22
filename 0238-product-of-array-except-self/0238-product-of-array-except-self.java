class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int preffix_array[]=new int[n];
        preffix_array[0]=1;
        for(int i=1;i<n;i++){
            preffix_array[i]=preffix_array[i-1]*nums[i-1];
        }
        int suffix_array[]=new int[n];
        suffix_array[n-1]=1;
        for(int j=n-2;j>=0;j--){
            suffix_array[j]=suffix_array[j+1]*nums[j+1];
        }
        for(int i=0;i<n;i++){
            nums[i]=preffix_array[i]*suffix_array[i];
        }
        return nums;
    }
}