class Solution {
    public String solution(String new_id) {
        StringBuilder answer =new StringBuilder(new_id.toLowerCase());
        // 2단계
        for(int i=0;i<answer.length();i++) {
            if( !isLower(answer.charAt(i)) &&
              !isNum(answer.charAt(i)) &&
              answer.charAt(i)!='-' &&
              answer.charAt(i)!='_'&&
              answer.charAt(i)!='.') {
                answer.deleteCharAt(i);
                i--; // 삭제 후 인덱스 조정
            }
        }
        //3단계
        new_id = answer.toString().replaceAll("\\.{2,}",".");
        answer = new StringBuilder(new_id);
        //4단계
        if(answer.length() > 0 && answer.charAt(0) =='.'){
            answer.deleteCharAt(0);
        }
        if(answer.length() > 0 && answer.charAt(answer.length() - 1)=='.'){
                answer.deleteCharAt(answer.length() - 1);
        }
        // 5단계
        if(answer.length() == 0){
            answer.append('a');
        } 
        // 6단계
        if(answer.length()>=16){ 
            answer.setLength(15);
            if(answer.charAt(answer.length() - 1)=='.'){
                answer.deleteCharAt(answer.length() - 1);
            }
        }
        
        while (answer.length() <= 2) { //7단계
            answer.append(answer.charAt(answer.length() - 1));
        }
        return answer.toString();
    }
    private boolean isLower(char c){
        return (c >='a')&&(c<='z');
    }
    private boolean isNum(char c){
        return (c >='0')&&(c<='9');
    }
}