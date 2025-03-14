class Solution {
    public int solution(int n) {
        //1과 2의 합으로 만들 수 있는 모든 경우의 수
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        int[] dp = new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=(dp[i-1]+dp[i-2]) % 1000000007;
        }
        
        return dp[n];
    }
}