import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        boolean[][] isfilled = new boolean[n][n];
        
        int sum = n*(n+1)/2; // 1부터 n까지의 합
        int x = -1;
        int y = 0;
        int num = 1;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i%3==0){ //아래
                    x++;
                } else if(i%3==1){ //오른쪽
                    y++;
                } else{
                    x--;
                    y--;
                }
                triangle[x][y]=num++;
            }
        
        }
        int[] answer = new int[sum];
        int index = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(triangle[i][j]==0) break;
                answer[index++] = triangle[i][j];
            }
        }
        return answer;
    }
}