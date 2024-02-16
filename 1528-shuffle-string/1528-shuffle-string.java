class Solution {
    public String restoreString(String s, int[] p) {
        char c[]=new char[s.length()];
        
        for(int i=0;i<s.length();i++){
           c[p[i]]=s.charAt(i);
        }
        return String.valueOf(c);
    }
}