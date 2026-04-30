class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int pivotFromLast = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(pivotFromLast))
                return false;
            pivotFromLast--;
        }
        return true;
    }
}
