class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n!=0){
        int b=n&1;
        n >>>= 1;
        int c=n&1;
        if (b==c){
            return false;
        }

        }
        return true;


    }
}
