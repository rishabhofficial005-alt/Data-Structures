class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int result=0;
        int preffix_sum=0;
        for(int num: nums){
            preffix_sum+=num;
            if(map.containsKey(preffix_sum-k)){
                result+=map.get(preffix_sum-k);
            }
            map.put(preffix_sum, map.getOrDefault(preffix_sum,0)+1);
            
        }
        return result;
    }
}