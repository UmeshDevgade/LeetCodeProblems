// 16 ms | 45 MB
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;
        Map<Character ,Integer> freqMap = new HashMap<>();
        for (char c: s.toCharArray()) {
            freqMap.put(c,(freqMap.getOrDefault(c,0)+1));
        }
        for (char c: t.toCharArray()) {
            freqMap.put(c,(freqMap.getOrDefault(c,0)-1));
            if(freqMap.get(c)<0) return false;
        }
        return true;

    }
}