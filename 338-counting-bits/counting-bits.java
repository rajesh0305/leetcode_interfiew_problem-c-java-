class Solution {
    public static int count(int n){
        int count = 0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n = n>>>1;
        }
        return count;
    }
    public int[] countBits(int n) {
      int i =0;
      int ans[] = new int [n+1];
      while(i<=n){
        ans[i] = count(i);
        i++;
      }  
return ans;
    }
}