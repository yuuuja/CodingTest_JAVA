import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        //초기화
        for(int i=0;i<priorities.length;i++){
            queue.add(new int[] {priorities[i],i});
        }
        int answer = 0;
        while(!queue.isEmpty()){
            int[] current = queue.poll(); //큐에서 프로세스 꺼내기
            boolean higherpriority = false;
            
            for(int[] q : queue){
                if(q[0] > current[0]){
                    higherpriority = true;
                    break;
                }
            }
            if(higherpriority){//우선순위가 높은 프로세스가 있다면 큐에 삽입
                queue.add(current);
            } else{
                answer++;
                if(current[1] == location){
                    return answer; //목표프로세스 실행 순서 반환
                }
            }
        }
        return answer;
    }
}