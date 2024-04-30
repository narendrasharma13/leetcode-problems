class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i:nums)
        {
            if(hm.get(i)==null)
                hm.put(i,1);
            else
                hm.put(i,hm.get(i)+1);
        }
        for(int i:hm.keySet())
        {
            if(hm.get(i)>=2)
                return true;
        }
        
        return false;
        
    }
}