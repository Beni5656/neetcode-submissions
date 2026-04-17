class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = {}

        for word in strs:
            nums = tuple(sorted(ord(letter) - ord('a') for letter in word))
            if nums in res:
                res[nums].append(word)
            else:
                res[nums] = [word]

        return list(i for i in res.values())
            
        
            


                