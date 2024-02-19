class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        int[] charIndex = new int[128]; // Assuming ASCII characters
        int max= 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            start = Math.max(start, charIndex[c]);
            max = Math.max(max, end - start + 1);
            charIndex[c] = end + 1;
        }

        return max;
    }
}
