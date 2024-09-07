class Solution {
    public int findDuplicate(int[] nums) {
     HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
     for(int i = 0;i<nums.length;i++){
         int ele = nums[i];
         if(map.containsKey(ele)){
           map.put(ele,map.get(ele)+1);
         }else{
            map.put(ele,1);
         }
     }
     int ans = 0;
     for(int val:map.keySet()){
          if(map.get(val)!=1){
            ans = val;
            break;
          }
     }
     return ans;
    }
}