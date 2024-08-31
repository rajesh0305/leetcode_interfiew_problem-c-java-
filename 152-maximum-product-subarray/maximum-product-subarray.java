class Solution {
  static int maxProductSubArray(int arr[]) {
    int prod1 = arr[0],prod2 = arr[0],result = arr[0];
    
    for(int i=1;i<arr.length;i++) {
        int temp = Math.max(arr[i],Math.max(prod1*arr[i],prod2*arr[i]));
        prod2 = Math.min(arr[i],Math.min(prod1*arr[i],prod2*arr[i]));
        prod1 = temp;
        
        result = Math.max(result,prod1);
    }
    return result;
  }
    public int maxProduct(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        // int max = 0;
        //    for(int i= 0;i<nums.length;i++){
        //        int maxProduct = 1;
        //          for(int j = i;j<nums.length;j++){
        //              maxProduct = maxProduct*nums[j];
        //              max = Math.max(maxProduct,max);
        //          }
        //    }
        //    return max;
        return maxProductSubArray(nums);
    }
}