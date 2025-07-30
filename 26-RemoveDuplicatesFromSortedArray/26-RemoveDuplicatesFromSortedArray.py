# Last updated: 7/30/2025, 9:31:28 AM
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0
        k = 1
        for i in range(1, len(nums)):
            if nums[i] != nums[i - 1]:
                nums[k] = nums[i]
                k += 1
        return k

solution = Solution()
nums = [1, 1, 2]
k = solution.removeDuplicates(nums)
print(k)      
print(nums[:k])  
