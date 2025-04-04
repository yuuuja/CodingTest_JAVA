import java.util.*;

class Solution {
    public long solution(int[] weights) {
        // 무게를 오름차순으로 정렬
        Arrays.sort(weights);
        
        // 무게별 등장 횟수 카운트
        Map<Double, Integer> map = new HashMap<>();
        
        long answer = 0;
        
        for (int weight : weights) {
            double a = weight*1.0;
            double b = weight*2.0/3.0;
            double c = weight*3.0/4.0;
            double d = weight*1.0/2.0;
            if(map.containsKey(a)) answer += map.get(a);
            if(map.containsKey(b)) answer += map.get(b);
            if(map.containsKey(c)) answer += map.get(c);
            if(map.containsKey(d)) answer += map.get(d);
            
            map.put((weight*1.0), map.getOrDefault((weight*1.0),0)+1);
        }
        
        return answer;
    }
}