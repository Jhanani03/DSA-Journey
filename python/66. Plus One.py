class Solution:
    def plusOne(self, d: List[int]) -> List[int]:
        n=len(d)
        num=0
        for i in range (0,n):
            num=(num*10)+d[i]
        level=num+1
        nxt=str(level)
        arr=[int(i) for i in str(nxt)]
        return arr

