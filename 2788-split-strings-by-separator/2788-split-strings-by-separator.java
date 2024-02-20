class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> nm=new ArrayList<>();
        StringBuffer s=new StringBuffer();
        for(int i=0;i<words.size();i++)
        {
            char arr[]=words.get(i).toCharArray();
            for(int j=0;j<arr.length;j++)
            {
                
                if(arr[j]!=separator)
                {
                    s.append(arr[j]);
                    if(j==arr.length-1){
                        nm.add(s.toString());
                         s.setLength(0);
                    }
                }
                else{
                    if(s.length()>0) {
                        nm.add(s.toString());
                        s.setLength(0);
                }
                }
            }
        }
        return nm;
    }
}