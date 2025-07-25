import java.util.*;
class Solution {
    static boolean[][] check;
    static int sizeCnt=1;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
    
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        check = new boolean[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (picture[i][j] != 0 && !check[i][j]) {
					numberOfArea++;
					dfs(i, j, picture);
					maxSizeOfOneArea = Math.max(maxSizeOfOneArea, sizeCnt);
					sizeCnt=1;
				}
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    private static void dfs(int x, int y, int[][] picture){
        check[x][y] = true;
        
        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx>=0 && ny>=0 && nx<picture.length && ny<picture[0].length) {
            	if(picture[x][y]==picture[nx][ny] && !check[nx][ny]) {
            		sizeCnt++;
            		dfs(nx, ny, picture);
            	}
            }
        }
    }
}