import java.util.*;
class Solution {
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int len = balls.length;
        int[] answer = new int[len];
        
        for(int i=0;i<len;i++){
            int x2 = balls[i][0];
            int y2 = balls[i][1];
            
            int best = Integer.MAX_VALUE;
            int dx = startX - x2;
            int dy = startY - y2;
            
            // 아래 벽 (y=0)
            if (!(startX == x2 && startY > y2)) {
                int d = dx * dx + (startY + y2) * (startY + y2);
                best = Math.min(best, d);
            }

            // 위 벽 (y=n)
            if (!(startX == x2 && startY < y2)) {
                int d = dx * dx + (2 * n - startY - y2) * (2 * n - startY - y2);
                best = Math.min(best, d);
            }

            // 왼쪽 벽 (x=0)
            if (!(startY == y2 && startX > x2)) {
                int d = dy * dy + (startX + x2) * (startX + x2);
                best = Math.min(best, d);
            }

            // 오른쪽 벽 (x=m)
            if (!(startY == y2 && startX < x2)) {
                int d = dy * dy + (2 * m - startX - x2) * (2 * m - startX - x2);
                best = Math.min(best, d);
            }
            answer[i] = best;
        }
        return answer;
    }
}