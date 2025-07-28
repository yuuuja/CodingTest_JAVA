class Solution {
    public int solution(int n) {
        //  f(n)= f(n-2)*4 - f(n-4)
        long[] tile = new long[5001];
        int answer = 0;
        int mod = 1000000007;
        
        tile[0] = 1;
        tile[2] = 3;
        for(int i=4;i<=n;i+=2){
            tile[i]=(tile[i-2]*4%mod - tile[i-4]%mod+mod)%mod;
        }
        answer = (int)tile[n];
        return answer;
    }
}