import java.util.*;
class Solution {
    int[][] dp;
    int[][] triangle;
    public int solution(int[][] triangle) {
        this.triangle = triangle;
        int n = triangle.length;
        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        
        return recur(0,0);
    }
    private int recur(int i, int j){
        if(i == triangle.length - 1){ //마지막줄
            return triangle[i][j];
        }
        
        if(dp[i][j] != -1) return dp[i][j];
        
        int left = recur(i+1, j);
        int right = recur(i+1, j+1);
        
        dp[i][j] = triangle[i][j] + Math.max(left, right);
        return dp[i][j];
    }
}