class Solution {
    public static int countpath(int i ,int j,int m,int n){
        if(i==m-1 && j==n-1)return 1;
        if(i>=m || j>=n)return 0;
        int ans = countpath(i+1,j,m,n)+countpath(i,j+1,m,n);
        return ans;
    }
    public static int dest(int a[][],int m, int n, int i, int j){
      if(i>=m || j>=n)
            return 0;
        if(i==m-1 && j==n-1)
            return 1;
        if(a[i][j]>0)
            return a[i][j];
        return a[i][j] = dest(a,m,n,i+1,j) + dest(a,m,n,i,j+1);
    }
    public int uniquePaths(int m, int n) {
        //return countpath(0,0,m,n);
      int a[][] = new int[m][n];
        return dest(a,m,n,0,0);
    }
    }
