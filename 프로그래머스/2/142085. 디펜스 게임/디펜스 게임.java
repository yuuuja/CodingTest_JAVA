import java.util.*;
class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = enemy.length; //초기값
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //내림차순
        int knight = n;
        int card = k;
        for (int i = 0; i < enemy.length; i++) {
            knight -= enemy[i];
            pq.add(enemy[i]);

            if (knight < 0) {
                if (card > 0 && !pq.isEmpty()) {
                    knight += pq.poll();
                    card--;
                } else {
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }
}
