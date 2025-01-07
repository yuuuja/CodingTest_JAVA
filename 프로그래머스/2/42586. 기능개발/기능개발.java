import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        List<Integer> left_days = new ArrayList<>();
        for(int i=0;i<progresses.length;i++){
            left_days.add((int)Math.ceil((100.0-progresses[i]) / speeds[i]));
        }
        int deployDay = left_days.get(0);
        int deployCount = 0;
        
        for(int i=0;i<left_days.size();i++){
            
            if(left_days.get(i) <= deployDay){
                deployCount++;
            } else {
                //새로운 배포날
                result.add(deployCount);
                deployDay = left_days.get(i);
                deployCount = 1;
            }
        }
        result.add(deployCount);
        return result.stream().mapToInt(i->i).toArray();
    }
}