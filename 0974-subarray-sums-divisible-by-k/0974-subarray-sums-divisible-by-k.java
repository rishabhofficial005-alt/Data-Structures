class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        //preffix sum
        int preffix_sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        for(int i=0;i<nums.length;i++){
            preffix_sum+=nums[i];
            int remainder=preffix_sum%k;
            if(remainder<0){
                remainder+=k;
            }
            if(map.containsKey(remainder)){
                count+=map.get(remainder);
            }
            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }
        return count;

    }
}