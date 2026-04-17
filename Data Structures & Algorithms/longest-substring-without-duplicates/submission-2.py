class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        left, right, longest = 0, 0, 0
        substring = set()

        while right < len(s):
            if s[right] not in substring:
                substring.add(s[right])
                right += 1
            else:
                substring.remove(s[left])
                left += 1
            longest = max(longest, len(substring))

        return longest