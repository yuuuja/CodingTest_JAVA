class Solution {
    public String solution(String myString) {
        char[] c = myString.toCharArray();
        String answer="";
        for(int i=0;i<c.length;i++){
            if(c[i]<'l'){
                c[i]='l';
            }
            answer +=c[i];
        }
        
        return answer;
    }
}