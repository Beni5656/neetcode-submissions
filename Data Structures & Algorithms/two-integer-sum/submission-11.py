class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        remainders = {}

        for index, num in enumerate(nums):
            if num in remainders.keys():
                return [remainders.get(num), index]
            remainders[target - num] = index

        return None