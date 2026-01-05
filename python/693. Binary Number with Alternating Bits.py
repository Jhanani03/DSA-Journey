class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        prev=n&1
        n=n>>1
        while n>0:
            curr=n&1
            if prev==curr:
                return False
            else:
                prev=curr
                n=n>>1
        return True

