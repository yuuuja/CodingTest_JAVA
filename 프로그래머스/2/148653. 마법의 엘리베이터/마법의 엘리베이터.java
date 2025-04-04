import java.util.*;
class Solution {
    public int solution(int storey) {
        // 그리디: 5이상이면 올림, 아니면 내림
        int answer = 0;
        while(storey>0){
            int n = storey % 10;
            
            if(n>5){
                answer += 10 - n;
                storey += 10 - n;
            } else if(n<5){
                answer += n;
                storey -= n;
            } else{
                if ((storey / 10) % 10 >= 5) {
                    answer += 10 - n;
                    storey += 10 - n;
                } else {
                    answer += n;
                    storey -= n;
                }
            }
            storey /= 10;
        }
        return answer;
    }
}