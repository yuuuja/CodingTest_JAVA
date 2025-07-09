import java.util.*;
class Solution {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();
        // 위아래 최소 조작 횟수
        for(int i=0;i<length;i++){
            char c = name.charAt(i);
            // 위로 가는 경우 c-'A'
            // 아래로 가는 경우 'Z'-c+1
            answer += Math.min(c-'A','Z'-c+1);
        }
        
        // 최소 좌우 이동 횟수
        int minMove = length -1;
        
        for(int i=0;i<length;i++){
            int next = i+1;
            while(next < length && name.charAt(next)=='A'){
                next++;
            }
            //왼쪽으로 갔다가 돌아오거나 오른쪽으로 갔다가 돌아오는 걸 모두 고려
            minMove = Math.min(minMove, i+(length-next) + Math.min(i, length-next));
        }
        answer+=minMove;
        return answer;
    }
}