class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        dict = {}
        for num in nums:
            if num in dict.keys():
                return True
            else:
                dict[num] = 1
        return False