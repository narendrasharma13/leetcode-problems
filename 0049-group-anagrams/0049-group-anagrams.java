class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String str: strs)
        {
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);
            if(hm.containsKey(sortedStr))
            {
               hm.get(sortedStr).add(str); 
            }
            else
            {
                List<String> subList= new ArrayList<>();
                subList.add(str);
                hm.put(sortedStr,subList); 
            } 
        }
        for(List<String> l: hm.values())
            list.add(l);
        
        return list;
        
        
    }
}