class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        countFreqS = {}
        countFreqT = {}

        for index, character in enumerate(s):
            if character in countFreqS.keys():
                countFreqS[character] += 1
            else:
                countFreqS[character] = 1
        
        for index, character in enumerate(t):
            if character in countFreqT.keys():
                countFreqT[character] += 1
            else:
                countFreqT[character] = 1
        
        return countFreqS == countFreqT