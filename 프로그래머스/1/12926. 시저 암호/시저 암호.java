class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c == ' '){
                answer.append(c);
            } else{
                if(Character.isUpperCase(c)){
                    answer.append((char)((c+n-'A')%26+'A'));
                } else if(Character.isLowerCase(c)){
                    answer.append((char)((c+n-'a')%26+'a'));
                }
            }
        }
        return answer.toString();
    }
}