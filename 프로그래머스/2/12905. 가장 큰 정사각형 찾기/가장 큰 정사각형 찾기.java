class Solution
{
    public int solution(int [][]board)
    { //dp
        int answer = 0;
        int n = board.length;
        int m = board[0].length;
        int[][] dp = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == 1){
                    if(i==0 || j==0){
                        // 가장자리
                        dp[i][j] = 1;
                    } else{
                        dp[i][j] = Math.min(
                            Math.min(dp[i-1][j], dp[i][j-1]), //왼쪽, 위, 왼위
                            dp[i-1][j-1]) +1;
                    
                    }
                    answer = Math.max(answer, dp[i][j]);
                }
            }
        }

        return answer*answer;
    }
}