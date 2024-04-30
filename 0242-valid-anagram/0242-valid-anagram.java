class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())
            return false;
        HashMap<Character,Integer> hm =new HashMap<>();
        
        char ch[] = s.toCharArray();
        char ch1[] = t.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(hm.containsKey(ch[i]))
                hm.put(ch[i],hm.get(ch[i])+1);
            else
                hm.put(ch[i],1);
        } 
        
        for(int i=0;i<ch1.length;i++)
        {
            if(hm.containsKey(ch1[i]))
                hm.put(ch1[i],hm.get(ch1[i])-1);
            else
                hm.put(ch1[i],1);       
        }
        
        for(Character c:hm.keySet())
        if(hm.get(c)>0)
            return false;
        return true;
        
        
    }
}