class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        d = {}
        freq = [[] for i in range(len(nums) + 1)]
        for num in nums:
            d[num] = d.get(num, 0) + 1
        
        result = []
        for num, count in d.items():
            freq[count].append(num)
        
        for i in range(len(freq) - 1, 0, -1):
            for num in freq[i]:
                result.append(num)
                if len(result) == k:
                    return result
            

