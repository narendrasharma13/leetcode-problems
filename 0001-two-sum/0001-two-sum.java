class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
        int i1 = -1,i2=-1;
        for(int i=0;i<nums.length;i++)
        {
            int remaining = target - nums[i];
            if(hm.containsKey(remaining))
            {
                i1 = hm.get(remaining);  
                i2=i;
            } 
            else
                hm.put(nums[i],i);
        }
        
        return new int[]{i1,i2};
        
    }
}