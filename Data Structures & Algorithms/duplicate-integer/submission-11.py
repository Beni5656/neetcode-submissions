class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        numsSoFar = []

        for i, num in enumerate(nums):
            if num in numsSoFar:
                return True
            numsSoFar.append(num)

        return False