class Solution:
    def isPalindrome(self, x: int) -> bool:
        orig=x
        rev=0
        if x<0:
            return False

        else:
