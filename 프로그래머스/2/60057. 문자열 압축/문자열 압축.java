import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = s.length();
        for(int i=1;i<=s.length()/2;i++){ //i는 단위
            StringBuilder sb = new StringBuilder();
            String base = s.substring(0,i); // 초기값
            int count = 1;
            
            for(int j=i;j<=s.length();j+=i){
                int endIdx = Math.min(j+i,s.length());
                String compare = (s.substring(j,endIdx));
                
                if(base.equals(compare)){
                    count++;
                } else{
                    if(count>=2){
                        sb.append(count);
                    }
                    sb.append(base);
                    base = compare;
                    count = 1;
                }
            }
            sb.append(base);
            answer = Math.min(answer, sb.length());
        }
        return answer;
    }
}