class Solution {
    public int[] plusOne(int[] digits) {
        int N=digits.length;
        for(int i=N-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        int[] arr=new int[N+1];
        arr[0]=1;
        return arr;
        }
    }
