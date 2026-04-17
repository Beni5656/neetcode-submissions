class Solution:
    def isValid(self, s: str) -> bool:
        stacks = []
        closeOpen = {')': '(', ']': '[', '}': '{'}

        for r in s:
            if r in closeOpen:
                if stacks and stacks[-1] == closeOpen[r]:
                    stacks.pop()
                else:
                    return False
            else:
                stacks.append(r)
        
        return True if not stacks else False