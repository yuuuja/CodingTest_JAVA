import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Long> heap = new PriorityQueue<>();
        int answer = 0;

        
        for(int n : scoville){
            heap.offer((long)n);
        }
        
        while(!heap.isEmpty() && heap.peek() < K){
            long firstScoville = heap.poll();
            if(firstScoville < 1){
                return -1;
            }
            long secondScoville = heap.poll();
            heap.offer(firstScoville+(secondScoville*2));
            if(heap.size() == 1 && heap.peek() < K){
                return -1;
            }
            answer++;
        }
       
        return answer;
    }
}