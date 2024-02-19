class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        
        int max = 0;
        StringBuffer b = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            b.setLength(0); // Clear StringBuffer for each iteration
            b.append(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (b.indexOf(String.valueOf(s.charAt(j))) == -1) {
                    b.append(s.charAt(j));
                } else {
                    break;
                }
            }
            if (b.length() > max) {
                max = b.length();
            }
        }

        return max;
    }
}
