class Solution {
    public int maxPartitions(String s) {
        
        if(s.length()==0) return 0;
        Map<Character, Integer>a = new HashMap<>();
        int end=0;
        int count=0;
        
        for(int i=0;i<s.length();i++){
            a.put(s.charAt(i),i);
        }
        
        for(int i=0;i<s.length();i++){
            end=Math.max(end,a.get(s.charAt(i)));
            
            if(end==i){
                count++;
            }
            
        }
        
        
        return count;
    }
}