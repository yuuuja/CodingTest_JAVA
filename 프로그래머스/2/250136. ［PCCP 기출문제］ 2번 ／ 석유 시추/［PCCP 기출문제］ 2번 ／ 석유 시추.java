import java.util.*;
class Solution {
    int[] dx = {-1,1,0,0};
    int[] dy = {0,0,-1,1};
    int[][] oil; //덩어리 id
    boolean[][] visited;
    Map<Integer, Integer> oilSize = new HashMap<>();
    int n,m;
    public int solution(int[][] land) {
        n = land.length;
        m = land[0].length;
        oil = new int[n][m];
        visited = new boolean[n][m];
        
        int id = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && land[i][j]==1){
                    bfs(i,j,id,land);
                    id++;
                }
            }
        }
        
        int answer = 0;
        for(int col = 0;col<m;col++){
            Set<Integer> set = new HashSet<>();
            for(int row = 0;row<n;row++){
                if(oil[row][col] != 0){
                    set.add(oil[row][col]);
                }
            }
            
            int total = 0;
            for(int groupId : set){
                total += oilSize.get(groupId);
            }
            answer = Math.max(answer, total);
        }
        return answer;
    }
    
    private void bfs(int x, int y, int id, int[][] land){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});
        visited[x][y] = true;
        oil[x][y] = id;
        
        int count = 1;
        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int i=0;i<4;i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                
                if(0<=nx && nx<n && 0<=ny && ny<m && !visited[nx][ny] && land[nx][ny]==1){
                    visited[nx][ny] = true;
                    oil[nx][ny] = id;
                    count++;
                    q.offer(new int[]{nx,ny});
                }
            }
        }
        oilSize.put(id, count);
    }
}