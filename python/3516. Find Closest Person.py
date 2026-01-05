class Solution:
    def findClosest(self, x: int, y: int, z: int) -> int:
        a=z-x
        one=abs(a)
        b=z-y
        two=abs(b)
        if one>two:
            return 2
        elif one==two:
            return 0
        else:
            return 1
        
