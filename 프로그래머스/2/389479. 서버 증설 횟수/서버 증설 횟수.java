import java.util.*;
class Solution {
    public int solution(int[] players, int m, int k) {
        // 최대 이용자 수 m, 서버 운영 가능 시간 k
        // 우선순위 큐 {만료시간, 증설된 서버 개수}
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1,o2)->o1[0]-o2[0]); //만료 빠른순
        int size = 0;  // 현재 서버의 개수 
        int count = 0; // 총 증설된 서버 횟수 
        for(int i=0;i<24;i++){
            while(!pq.isEmpty() && pq.peek()[0]==i){
                size-=pq.poll()[1];
            }
            int need = players[i] / m;  // 현재 필요한 서버의 개수 
            int more = size - need;     // - 서버 증설 개수  
            if(more < 0){
                more = -more;
                size  += more;
                count += more;
                pq.offer(new int []{i + k, more});
            }
        }

        return count;
    }
}