class Solution {
    public int solution(String myString, String pat) {
        char[] str = myString.toCharArray();
        for(int i=0;i<str.length;i++){
            if(str[i]=='A'){
                str[i]='B';
            } else{
                str[i]='A';
            }
        }
        
        int answer = String.valueOf(str).contains(pat)?1:0;
        return answer;
    }
}