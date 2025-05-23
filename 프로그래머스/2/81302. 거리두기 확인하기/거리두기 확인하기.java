import java.util.*;
class Solution {
    private int[] dx = {-1,1,0,0};
    private int[] dy = {0,0,-1,1};
    public int[] solution(String[][] places) {
        // 맨해튼 거리  |r1 - r2| + |c1 - c2|
        // bfs
        int n = places.length;
        int[] answer = new int[n];
        
        for(int i=0;i<n;i++){
            char[][] map = new char[5][5];
            for(int j=0;j<5;j++){
                map[j] = places[i][j].toCharArray();
            }
            answer[i] = isSafe(map)?1:0;
        }
        
        return answer;
    }
    boolean isSafe(char[][] map){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (map[i][j] == 'P') {
                    if (!bfs(map, i, j)) return false; // 하나라도 위반하면 false
                }
            }
        }
        return true;
    }
    boolean bfs(char[][] map, int x, int y){
        Queue<Node> q = new LinkedList<>();
        boolean[][] visited = new boolean[5][5];
        q.offer(new Node(x,y,0));
        visited[x][y] = true;
        
        while(!q.isEmpty()){
            Node node = q.poll();
            if(node.depth >= 1 && map[node.x][node.y] == 'P'){
                return false;
            }
            
            if(node.depth == 2) continue;
            
            for(int dir = 0;dir<4;dir++){
                int nx = node.x+dx[dir];
                int ny = node.y+dy[dir];
                
                if(nx<0||nx>=5||ny<0||ny>=5) continue; //범위 초과
                if(visited[nx][ny]) continue; //방문했으면패스 
                if(map[nx][ny] == 'X') continue; //파티션
                
                visited[nx][ny] = true;
                q.offer(new Node(nx,ny,node.depth+1));
            }
        }
        return true;
    }
    class Node{
        int x, y, depth;
        Node(int x, int y, int depth){
            this.x=x;
            this.y=y;
            this.depth=depth;
        }
    }
}