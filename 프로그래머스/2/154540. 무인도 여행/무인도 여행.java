import java.util.*;
class Solution {
    
    public int[] solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        boolean[][] visited = new boolean[n][m];
        List<Integer> result = new ArrayList<>();
        
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && maps[i].charAt(j) != 'X'){
                    int sum = 0;
                    Queue<int[]> queue = new LinkedList<>();
                    queue.offer(new int[]{i,j});
                    visited[i][j] = true;
                    
                    while(!queue.isEmpty()){
                        int[] current = queue.poll();
                        int cx = current[0];
                        int cy = current[1];
                        
                        sum+= maps[cx].charAt(cy) - '0';
                        
                        for(int d=0;d<4;d++){
                            int nx = cx + dx[d];
                            int ny = cy + dy[d];
                            
                            if(nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny] && maps[nx].charAt(ny) != 'X'){
                                visited[nx][ny] =true;
                                queue.offer(new int[]{nx, ny});
                            }
                        }
                    }
                    result.add(sum);
                }
            }
        }
        
        if(result.isEmpty()){
            return new int[]{-1};
        }
        
        Collections.sort(result);
        
        return result.stream().mapToInt(i->i).toArray();
    }
}