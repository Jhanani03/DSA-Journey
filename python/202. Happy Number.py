class Solution:
    def isHappy(self, n: int) -> bool:
        
        while n>9:
            h=0
            while n>0:
                d=n%10
                h=(d**2)+h
                n=n//10
            if h==1:
                return True
            n=h
        if n==1 or n==7:
            return True
        else:
            return False
