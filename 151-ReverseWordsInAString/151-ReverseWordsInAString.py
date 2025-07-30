# Last updated: 7/30/2025, 9:21:50 AM
class Solution:
    def reverseWords(self, s: str) -> str:
        words = s.split()
        reversed_words = words[::-1]
        return " ".join(reversed_words)

solution = Solution()
s = "  hello   world  "
result = solution.reverseWords(s)
print(result)  
