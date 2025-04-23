import java.util.*;
class Solution {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        
        //시작, 레버 위치
        int sx= 0, sy= 0, lx= 0, ly= 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                char ch = maps[i].charAt(j);
                if (ch == 'S') {
                    sx = i;
                    sy = j;
                } else if (ch == 'L') {
                    lx = i;
                    ly = j;
                }
            }
        }
        
        // 1. S -> L
        int dist1 = bfs(sx, sy, 'L', maps);
        if (dist1 == -1) return -1;

        // 2. L -> E
        int dist2 = bfs(lx, ly, 'E', maps);
        if (dist2 == -1) return -1;

        return dist1 + dist2;
    }
     private int bfs(int x, int y, char target, String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        boolean[][] visited = new boolean[n][m];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y, 0});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];
            int dist = cur[2];

            if (maps[cx].charAt(cy) == target) return dist;

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m &&
                        !visited[nx][ny] && maps[nx].charAt(ny) != 'X') {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, dist + 1});
                }
            }
        }

        return -1;
    }
}