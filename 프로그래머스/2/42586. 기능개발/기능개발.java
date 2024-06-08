import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0;i<progresses.length;i++){
            int days = (int)Math.ceil((100.0-progresses[i])/speeds[i]); //각 작업의 완료일수
                queue.add(days);
        }
        List<Integer> result = new ArrayList<>();
        while(!queue.isEmpty()){
            int deployDay = queue.poll();
            int deploycount = 1; //배포날짜와 배포기능수
            
            while(!queue.isEmpty()&&queue.peek() <=deployDay){
                queue.poll();
                deploycount++;
            }
            result.add(deploycount);
        }
        int[] answer = result.stream().mapToInt(i->i).toArray();
        return answer;
    }
}