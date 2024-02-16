class Solution {
    public int[] findArray(int[] pref) {
        int[] l=new int[pref.length];
         l[0]=pref[0];                               
        for(int i=1;i<pref.length;i++){
            l[i]=pref[i-1]^pref[i];
        }
        return l;
    }
}