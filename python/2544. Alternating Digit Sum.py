class Solution:
    def alternateDigitSum(self, n: int) -> int:
        num=str(n)
        sign=1
        sum=0
        for i in num:
            sum += sign*int(i)
            sign *= -1
        return sum
        
