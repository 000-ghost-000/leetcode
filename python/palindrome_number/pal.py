class Solution:
    def isPalindrome(self, x: str) -> bool:
        y=str(x)
        y=y[::-1]
        x=str(x)
        return(x==y)
