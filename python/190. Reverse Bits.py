class Solution:
    def reverseBits(self, n: int) -> int:


            bin=f"{n:032b}"
            rb=bin[::-1]
            return int(rb,2)
