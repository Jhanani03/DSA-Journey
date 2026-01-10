class Solution {
    public String addBinary(String a, String b) {
        int first=Integer.parseInt(a,2);
        int sec = Integer.parseInt(b,2);
        int sum= first+sec;
        String bin="";
        while(sum!=0){
            int rem=sum%2;
            bin=rem+bin;
            sum=sum/2;
        }
        return bin;
    }
}
