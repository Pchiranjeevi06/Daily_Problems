class Solution {
    public String interpret(String c) {
        StringBuilder Sb = new StringBuilder(c.length());

    for(int i =0; i< c.length(); i++){
        if(c.charAt(i) == 'G'){
            Sb.append("G");
        }
            if(c.charAt(i) == '('){
                if(c.charAt(i+1) == ')'){
                    Sb.append("o"); i++;
                }
                else{Sb.append("al"); i=i+3;}
            }
    }
            return Sb.toString();
    }
            
}