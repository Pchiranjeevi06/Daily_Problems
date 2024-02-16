class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String b="",a="";
        for(String k: word1){
            a+=k;
        }
        for(String k: word2){
            b+=k;
        }
        if(b.equals(a)){
            return true;
        }
        return false;
    }
}