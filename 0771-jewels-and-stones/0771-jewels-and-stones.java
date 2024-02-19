class Solution {
   public static int numJewelsInStones(String jewels, String stones) {
            int count = 0;
            String s = stones;
            for (char c : stones.toCharArray()) {
                if (jewels.indexOf(c) != -1) {
                    count++;
                    s = s.substring(0, s.indexOf(c)) + s.substring(s.indexOf(c) + 1, s.length());
                }
            }
            return count;
        }
}
