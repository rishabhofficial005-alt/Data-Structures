class Solution {
    public boolean check_permutation(int[] freq, int[] window_freq){
        for(int i=0;i<26;i++){
            if(freq[i]!=window_freq[i]){
                return false;
            }

        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list=new ArrayList<>();
        int freq[]=new int[26];
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
        }
        
        int window_size=p.length();
        for(int i=0;i<s.length();i++){
            int window_freq[]=new int[26];
            int window_index=0;
            int index=i;
            while(window_index<window_size && index<s.length()){
                window_freq[s.charAt(index)-'a']++;
                window_index++;
                index++;
            }
            if(check_permutation(freq,window_freq)){
                list.add(i);
            }
        }
        return list;
    }
}