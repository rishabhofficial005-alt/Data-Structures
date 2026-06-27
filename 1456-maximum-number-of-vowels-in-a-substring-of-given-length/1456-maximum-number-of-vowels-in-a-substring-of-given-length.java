class Solution {
    public int maxVowels(String s, int k) {
        int vowel_count=0;
        for(int i=0;i<k;i++){
            
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||
            s.charAt(i)=='u'){
                vowel_count+=1;
            }
        }
        int max_vowel_count=vowel_count;
        for(int i=k;i<s.length();i++){
            if(s.charAt(i-k)=='a'||s.charAt(i-k)=='e'||s.charAt(i-k)=='i'||s.charAt(i-k)=='o'||
            s.charAt(i-k)=='u'){
                vowel_count--;
            }
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||
            s.charAt(i)=='u'){
                vowel_count++;
            }
            max_vowel_count=Math.max(vowel_count,max_vowel_count);
        }
        return max_vowel_count;

        
    }
}