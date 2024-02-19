class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        
        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            StringBuffer b = new StringBuffer();
            b.append(s.charAt(i));
            count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (b.indexOf(String.valueOf(s.charAt(j))) == -1) {
                    b.append(s.charAt(j));
                    count++;
                } else {
                    break;
                }
            }
            if (count > max) {
                max = count;
            }
        }

        return max;
    }
}
