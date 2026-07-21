class Solution {
    private boolean Permutation(int []freq, int[] window_freq){
        for(int i=0;i<26;i++){
            if(freq[i]!=window_freq[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int freq1[]=new int[26];
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }
       
        int window_length=s1.length();
        for(int i=0;i<s2.length();i++){
            int window_index=0;
            int index=i;
            int windowfreq1[]=new int[26];
            while(index<s2.length() && window_index<window_length){
                windowfreq1[s2.charAt(index)-'a']++;
                window_index++;
                index++;
            }
            if(Permutation(freq1, windowfreq1)){
                return true;
            }
        }
        
         return false;
         

        }
       
    }
