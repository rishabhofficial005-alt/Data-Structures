class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> tmap=new HashMap<>();
        for(char c: t.toCharArray()){
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> smap=new HashMap<>();
        int count=t.length();
        String ans="";
        int left=0;
        int min_len=Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++){
            char rightchar=s.charAt(right);
            smap.put(rightchar,smap.getOrDefault(rightchar,0)+1);
            if(tmap.containsKey(rightchar) && smap.get(rightchar)<=tmap.get(rightchar)){
                count--;
            }
            while(count==0){
                if(min_len>right-left+1){
                    min_len=right-left+1;
                    ans=s.substring(left,right+1);
                }
                char leftchar=s.charAt(left);
                smap.put(leftchar,smap.get(leftchar)-1);
                if(tmap.containsKey(leftchar) && smap.get(leftchar)<tmap.get(leftchar)){
                  
                    count++;
                }
                left++;
            }
        }
        return ans;
    }
}