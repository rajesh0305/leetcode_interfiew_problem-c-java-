class Solution {
    public static int find(int arr[],int start){
        int product  = 1;
        for(int i =0;i<arr.length;i++){
            if(i!=start){
            product = product*arr[i];
        }
    }
        return product;
    }
    public int[] productExceptSelf(int[] nums) {
    //     int n  = nums.length;
    //    int ans[] = new int[n];
    //    for(int i = 0;i<n;i++){
    //     ans[i] = find(nums,i);
    //    }
    //    //ans[n-1] = nums[n-1];
    //    return ans;
    int pre[]  = new int[nums.length];
    int suff[] = new int[nums.length];
       pre[0] = nums[0]; 
    for(int i = 1;i<nums.length;i++){
        pre[i] = nums[i]*pre[i-1];
    }
    suff[nums.length-1] = nums[nums.length-1];
    for(int i = nums.length-2;i>=0;i--){
        suff[i] = suff[i+1]*nums[i];
    }
    for(int i = 1;i<nums.length-1;i++){
        nums[i] = pre[i-1]*suff[i+1];
    }
    nums[0] = suff[1];
    nums[nums.length-1] = pre[nums.length-2];
    return nums;
    }
}