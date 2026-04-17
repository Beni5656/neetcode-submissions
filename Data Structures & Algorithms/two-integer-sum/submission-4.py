class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dic1 = {}

        for i, n in enumerate(nums):
            diff = target - n
            if diff in dic1:
                return [dic1[diff], i]
            dic1[n] = i
        
        return []

            



        

