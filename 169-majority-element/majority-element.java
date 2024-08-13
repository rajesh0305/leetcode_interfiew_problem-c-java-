class Solution {
    public int majorityElement(int[] nums) {
          //   Arrays.sort(nums); // for sort the given array
	//return nums[nums.length/2];


    //using moores voting algorithms:
    int count = 0;
    int candidates =0;
    for(int num:nums)
    {
        if(count==0)
        {
            candidates = num;
        }
        if(num == candidates) count++;
        else count--;
    }
return candidates;
}   
}