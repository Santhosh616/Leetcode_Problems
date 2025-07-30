// Last updated: 7/30/2025, 10:11:53 AM
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
