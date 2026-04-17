class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        dict1, dict2 = {}, {}
        for letter in s:
            if letter in dict1.keys():
                dict1[letter] += 1
            else:
                dict1[letter] = 1
        for letter in t:
            if letter in dict2.keys():
                dict2[letter] += 1
            else:
                dict2[letter] = 1
        return dict1 == dict2