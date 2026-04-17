class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        for i in range(len(nums)):
            for n in range(len(nums)):
                if nums[i] == nums[n] and i != n:
                    return True
        return False