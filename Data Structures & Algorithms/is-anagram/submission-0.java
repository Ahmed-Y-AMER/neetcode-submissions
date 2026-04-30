class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sHash = new HashMap<>();
         HashMap<Character, Integer> tHash = new HashMap<>();

         if(s.length() != t.length())
             return false;

         for (int i = 0; i < s.length(); i++) {
             if (sHash.containsKey(s.charAt(i)))
                 sHash.put(s.charAt(i), sHash.get(s.charAt(i)) + 1);
             else
                 sHash.put(s.charAt(i), 1);
         }
         for (int i = 0; i < t.length(); i++) {
             if (tHash.containsKey(t.charAt(i)))
                 tHash.put(t.charAt(i), tHash.get(t.charAt(i)) + 1);
             else
                 tHash.put(t.charAt(i), 1);
         }

         for (int i = 0; i < sHash.size(); i++) {
             if(!Objects.equals(sHash.get(s.charAt(i)), tHash.get(s.charAt(i))))
                 return false;
         }

         return true;
    }
}
