class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isEven = true;
        
        for(char c : s.toCharArray()){
            if(c == ' '){
                answer.append(c); //공백 삽입
                isEven = true; //다시 처음부터 인덱스 시작
            } else{
                if(isEven){
                    answer.append(Character.toUpperCase(c));
                } else{
                    answer.append(Character.toLowerCase(c));
                }
                isEven = !isEven;
            }
            
        }
        
        return answer.toString();
    }
}