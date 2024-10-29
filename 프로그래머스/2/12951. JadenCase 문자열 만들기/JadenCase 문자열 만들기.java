class Solution {
    public String solution(String s) {
        
        String[] str = s.split(" ",-1); // 공백 포함
        for(int i=0;i<str.length;i++){
            if(!str[i].isEmpty()){
                str[i]=Character.toUpperCase(str[i].charAt(0)) 
                    + str[i].substring(1).toLowerCase();
            }
            
        }
        String answer = String.join(" ",str);
        
        return answer;
    }
}