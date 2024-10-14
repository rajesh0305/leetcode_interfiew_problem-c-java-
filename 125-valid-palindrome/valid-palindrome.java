class Solution {
    public boolean isPalindrome(String s) {
        int n =s.length();
        if(n<=1){
            return true;
        }
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            char left = s.charAt(i);
            char right = s.charAt(j);
            if(!Character.isLetterOrDigit(left)){
                    i++;
            }else if(!Character.isLetterOrDigit(right)){
                j--;
            }else{
        		if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
        			return false;
        		}
        		i++;
        		j--;
        	}
        }
        return true;
    }
}