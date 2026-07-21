class Solution {
    private boolean checkPermutation(int []freq1,int []windowfreq){
        for(int i=0;i<26;i++){
            if(freq1[i]!=windowfreq[i]){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list=new ArrayList<>();
        int []freq1=new int [26];
        for(int i=0;i<p.length();i++){
            freq1[p.charAt(i)-'a']++;
        }
        int window_length=p.length();
        for(int i=0;i<s.length();i++){
            int window_index=0;
            int index=i;
            int window_freq[]=new int [26];
            while(index<s.length() && window_index<window_length){
                window_freq[s.charAt(index)-'a']++;
                window_index++;
                index++;
            }
            if(checkPermutation(freq1,window_freq)){
                list.add(i);
            }

        }
        return list;
    }
}