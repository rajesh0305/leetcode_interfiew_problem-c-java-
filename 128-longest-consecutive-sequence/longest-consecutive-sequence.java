class Solution {
    public static boolean linearSearch(int arr[],int x){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }
    public static int optimal(int nums[]){
        int n = nums.length;
        if(n==0){
            return 0;
        }
        Set<Integer>s = new HashSet<>();
        for(int i = 0;i<n;i++){
            s.add(nums[i]);
        }
        int largest = 1;
        for(int ele:nums){
           if(!s.contains(ele-1)){
            int count = 1;
            int x = ele;
            while(s.contains(x+1)){
                count =count+1;
                x =x+1;
            }
            largest = Math.max(largest,count);
           }
        }
        return largest;
    }
    public int longestConsecutive(int[] nums) {
        // int n = nums.length ;
        // if(n==0){
        //     return 0;
        // }
        // int longest = 1;
        //  for(int i =0;i<nums.length;i++){
        //      int count= 1;
        //        int x =nums[i];
        //          while(linearSearch(nums,x+1)==true){
        //              x = x+1;
        //              count++;
        //          }
        //          longest = Math.max(longest,count);

        //  }
        //  return longest;
        return optimal(nums);
    }
}