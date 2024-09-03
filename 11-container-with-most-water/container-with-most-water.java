class Solution {
    public int maxArea(int[] height) {
      int low= 0;
      int high = height.length-1;
      int ans = 0;
      while(low<high){
        int left = height[low];
        int right= height[high];
      int area = Math.min(left,right)*(high-low);
      ans = Math.max(area,ans);
      if(left<right){
         low++;
      }else{
         high--;
      }
      }
      return ans;  
    }
}