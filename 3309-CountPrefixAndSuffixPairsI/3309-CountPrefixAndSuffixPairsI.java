// Last updated: 8/7/2025, 3:20:02 PM
class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    boolean isPrefixAndSuffix(String str1, String str2) {
        int n = str1.length();
        if (str2.length() < n) return false;
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
}
