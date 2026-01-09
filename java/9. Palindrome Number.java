class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        else if (x>0){
            int reverse=0;
            int real=x;
            while(x>0){
                int d=x%10;
                reverse=reverse*10+d;
                 x=x/10;

            }
            if (real==reverse){
                return true;
            }
            else {
                return false;
            }
        }
        else{
            return true;
        }
    }
}
