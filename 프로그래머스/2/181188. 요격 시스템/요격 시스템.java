import java.util.*;
class Solution {
    public int solution(int[][] targets) {
        // 그리디 -> 가능한 가장 이른 시점에 요격해서 최대한 많이 커버
        // 끝나는 구간을 기준으로 오름차순 정렬
        Arrays.sort(targets,(o1,o2)->{
            return o1[1]-o2[1];
        });
        
        int answer = 0;
        //가장 최근에 요격한 시점
        int last = -1;
        for(int[] target:targets){
            if(last == -1){ // 첫 미사일
                answer++;
                last = target[1] -1; //끝나는 시점 직전에 요격
                continue;
            }
            
            if(last >= target[0] && last <= target[1]) continue;
            
            answer++;
            last = target[1]-1;
        }
        return answer;
    }
}