class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dic1 = {}

        for index in range(len(nums)):
            diff = target - nums[index]
            if diff in dic1:
                return [dic1[diff], index]
            dic1[nums[index]] = index

        
        return []

            



        

