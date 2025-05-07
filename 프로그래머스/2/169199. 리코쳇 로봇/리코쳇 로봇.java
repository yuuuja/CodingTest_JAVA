import java.util.*;

class Solution {
    public int solution(String[] board) {
        int H = board.length;
        int W = board[0].length();
        boolean[][] visited = new boolean[H][W];
        int[] start = new int[2];
        int[] goal = new int[2];
        
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                char c = board[i].charAt(j);
                if (c == 'R') start = new int[]{i, j};
                if (c == 'G') goal = new int[]{i, j};
            }
        }
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start[0], start[1], 0});
        visited[start[0]][start[1]] = true;
        
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1], dist = curr[2];
            
            if(x == goal[0] && y == goal[1]) return dist;
            
            for(int i=0;i<4;i++){
                int nx = x;
                int ny = y;
                
                // 장애물이나 벽 전까지 한 방향으로 쭉 이동
                while(true){
                    int nextX = nx + dx[i];
                    int nextY = ny + dy[i];
                    if (nextX < 0 || nextY < 0 || nextX >= H || nextY >= W) break;
                    if (board[nextX].charAt(nextY) == 'D') break;
                    nx = nextX;
                    ny = nextY;
                }
                
                // 도착한 좌표가 방문되지 않았다면 추가
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, dist + 1});
                }
            }
        }
        
        return -1;
    }
}