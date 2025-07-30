# Last updated: 7/30/2025, 9:31:35 AM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        original = str(x)
        reversed_x = original[::-1]
        return original == reversed_x

solution = Solution()

x1 = 121
print(solution.isPalindrome(x1))  

x2 = -121
print(solution.isPalindrome(x2))  

x3 = 10
print(solution.isPalindrome(x3))  
 

