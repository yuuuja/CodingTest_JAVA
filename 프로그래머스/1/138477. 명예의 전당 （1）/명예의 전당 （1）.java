import java.util.PriorityQueue;
class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        int[] answer = new int[score.length];
        for(int i=0;i<score.length;i++){
            
            if (pq.size() < k) {
                pq.offer(score[i]);
            } else {
                Integer smallest = pq.peek();
                if (score[i]>smallest) {
                    pq.poll();
                    pq.offer(score[i]);
                }
            }
            answer[i] = pq.peek();
        }
        return answer;
    }
}