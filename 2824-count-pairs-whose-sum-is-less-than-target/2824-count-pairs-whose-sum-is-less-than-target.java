class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int c=0;
        int l=0,r=nums.size()-1;
        while(l<r){
            if(nums.get(l)+nums.get(r)<target){
                c+=(r-l);
                l++;
            }
            else{
                r--;
            }
        }
        return c;
    }
}