class Solution {
    public static int bruteforce(int nums[],int k){
        int maxlen = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            for(int j = i;j<n;j++){
                int sum =0;
                for(int l = i;l<=j;l++){
                    sum = sum+nums[l];
                }
                if(sum==k){
                    maxlen = Math.max(maxlen,j-i+1);
                }
            }
        }
        return maxlen;
    }
    public static int better(int nums[],int k){
          int count = 0;
            for(int i = 0;i<nums.length;i++){
                int sum = 0;
                  for(int j = i;j<nums.length;j++){
                      sum = sum+nums[j];
                      if(sum==k){
                          count++;
                      }
                  }
            }
            return count;
    }
    public static int optimal(int nums[],int k){
         int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
      
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public int subarraySum(int[] nums, int k) {
           return optimal(nums,k);
    }
}