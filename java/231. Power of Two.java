class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n<1) {
            return false;
        }
        else if (n==1) {
            return true;
        }
        else{
        while(n>1){
            int rem=n%2;
            if (rem!=0){
                return false;

            }
            else {
                    n=n/2;
            }
        }
        return true;
         }
    }
}
