class Solution {
    public boolean isSubsequence(String s, String t) {
    //    int n = s.length();
    //    int m =s.length();
    //    if(n>m){
    //     return false;
    //    } 
      int n = s.length(), m = t.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j))
                i++;
            j++;
        }
        return i == n;
    }
}