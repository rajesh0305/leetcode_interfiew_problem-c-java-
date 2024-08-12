class Solution {
    public int removeElement(int[] nums, int val) {
        //by using the two pointer 
        int index = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[index++] = nums[i];
                
            }
        }
        return index;
    }
}