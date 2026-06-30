class Solution {

    public boolean checkPermutation(int[] freq, int[] windFreq) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] != windFreq[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq = new int[26];

        // Frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int windowSize = s1.length();

        // Check every window of size windowSize
        for (int i = 0; i <= s2.length() - windowSize; i++) {

            int[] windFreq = new int[26];

            int windowIndex = 0;
            int index = i;

            while (windowIndex < windowSize) {
                windFreq[s2.charAt(index) - 'a']++;
                windowIndex++;
                index++;
            }

            if (checkPermutation(freq, windFreq)) {
                return true;
            }
        }

        return false;
    }
}