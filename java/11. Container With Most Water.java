class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int n=height.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                int length;
                if (height[i]>height[j]){
                     length=height[j];
                }
                else{
                     length=height[i];
                }
                int area=(j-i)*length;
                if(area>max){
                    max=area;
                }
                
            }
        }
                    return max;
    }
}
