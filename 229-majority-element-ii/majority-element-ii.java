class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            int ele = nums[i];
            if(hm.containsKey(ele)){
                hm.put(ele,hm.get(ele)+1);
            }else{
                hm.put(ele,1);
            }
        }
        int n = nums.length;
        int con = n/3;
        List<Integer>ans=  new ArrayList<Integer>();
        for(int key:hm.keySet()){
            int val = hm.get(key);
            if(val>con){
               ans.add(key);
            }
        }
        return ans;
    }
}