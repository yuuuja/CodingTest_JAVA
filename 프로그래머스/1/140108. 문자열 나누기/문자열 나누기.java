class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
        int x_cnt = 0;
        int others = 0;
        
        for(char c : s.toCharArray()) {
            if(x_cnt==others && x_cnt!=0){
                answer++;
                x_cnt=0;
                others=0;
            }
            
            if(x_cnt==0){
                x = c;
            }
            
            if(c==x){
                x_cnt++;
            } else{
                others++;
            }
        }
        
        if(x_cnt!=0){ // 마지막 문자열 처리
            answer++;
        }
        
        return answer;
    }
}