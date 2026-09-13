// 18 ms | 46.9 MB
class Solution {
    public boolean isAnagram(String s, String t) {
                if (s.length() != t.length()) return false;

        Map<Character, Integer> sfreq = new HashMap<>();
        Map<Character, Integer> tfreq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            if (sfreq.containsKey(sChar)) {
                sfreq.put(sChar, sfreq.get(sChar) + 1);
            } else {
                sfreq.put(sChar, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char tChar = t.charAt(i);
            if (tfreq.containsKey(tChar)) {
                tfreq.put(tChar, tfreq.get(tChar) + 1);
            } else {
                tfreq.put(tChar, 1);
            }
        }

        for (char c : sfreq.keySet()) {
            if (!tfreq.containsKey(c) || !tfreq.get(c).equals(sfreq.get(c))) {
                return false;
            }
        }

        return true;
    }
}