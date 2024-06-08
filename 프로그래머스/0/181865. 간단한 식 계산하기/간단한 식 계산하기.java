class Solution {
    public int solution(String binomial) {
        String[] str = binomial.split(" ");
        
        if(str[1].equals("+")){
            return Integer.valueOf(str[0]) + Integer.valueOf(str[2]);
        }
        else if(str[1].equals("-")){
            return Integer.valueOf(str[0]) - Integer.valueOf(str[2]);
        }
        else{
            return Integer.valueOf(str[0]) * Integer.valueOf(str[2]);
        }
        
    }
}