import java.util.*;
class Solution {
    public int solution(int m, int n, int[][] puddles) {
        // DP
        int mod = 1000000007; 
        int[][] arr = new int[n][m];
        
        for(int[] puddle : puddles){
            arr[puddle[1]-1][puddle[0]-1] = -1;
        }
        
        arr[0][0] = 1; //출발점 초기화
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                    continue;
                }
                
                if(i!=0){
                    // 위쪽 값 더해주기
                    arr[i][j] += arr[i-1][j] % mod;
                }
                if(j!=0){
                    // 왼쪽 값 더해주기
                    arr[i][j] += arr[i][j-1] % mod;
                }
            }
        }
        return arr[n-1][m-1] % mod;
    }
}