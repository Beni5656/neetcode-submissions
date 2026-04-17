class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left = 0
        right = 1
        while left < len(numbers):
            diff = target - numbers[left]
            if diff == numbers[right]:
                return [left + 1, right + 1]
            else:
                right += 1
            if right >= len(numbers):
                left += 1
                right = left + 1