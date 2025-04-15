import java.util.*;
class Solution {
    public int solution(String[][] book_time) {
        Arrays.sort(book_time, (a, b) -> timeToMinutes(a[0]) - timeToMinutes(b[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(String[] time : book_time){
            int start = timeToMinutes(time[0]);
            int end = timeToMinutes(time[1]) + 10;
            
            if(!pq.isEmpty() && pq.peek() <= start){ // 현재 시작 시간보다 먼저 끝나는 객실 재사용
                pq.poll();
            }
            pq.offer(end);
        }
        
        
        return pq.size();
    }
    private int timeToMinutes(String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        return hour * 60 + minute;
    }

}