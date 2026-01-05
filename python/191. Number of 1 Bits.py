class Solution:
    def hammingWeight(self, n: int) -> int:
        bin=f"{n:b}"
        conv=int(bin)
        c=0
        while conv>0 :
            rem=conv%10
            conv=conv//10
