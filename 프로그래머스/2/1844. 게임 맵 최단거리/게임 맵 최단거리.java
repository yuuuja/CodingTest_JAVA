import java.util.*;
class Solution {    
    private int[] dx = {-1,1,0,0};
    private int[] dy = {0,0,-1,1};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        
        int answer = bfs(maps, visited, 0,0);
        return answer;
    }
    public int bfs(int[][] maps, boolean[][] visited, int x, int y){
        int n = maps.length;
        int m = maps[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y,1}); // 현재 x,y,이동 거리
        visited[x][y]=true;
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            int dist = current[2];
            
            if(cx == n-1 && cy == m-1) return dist; // 도착점
            
            for(int i=0;i<4;i++){
                int nx = cx+dx[i]; 
                int ny = cy+dy[i];
                
                if(nx>=0 && ny>=0 && nx<n && ny<m && maps[nx][ny] == 1 && !visited[nx][ny]){
                    queue.add(new int[]{nx, ny, dist+1});
                    visited[nx][ny] = true; //방문 처리
                }
            }
        }
        return -1; //상대 팀 진영에 도달 할 수 없는 경우
        
    }
}