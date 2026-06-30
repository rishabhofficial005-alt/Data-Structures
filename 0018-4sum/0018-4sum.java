class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int left=j+1;
                int right=nums.length-1;
                
                while(left<right){
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if(sum==target){
                        set.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                    }
                    else  if(sum>target){
                            right--;
                    }
                    else{
                        left++;
                    }

                    
                }
            }
        }
        return new ArrayList<>(set);
    }
}