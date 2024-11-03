class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n/2;i++){
            int sum = 0;
            int start_num = i;
            while(sum<=n){
                sum+=start_num++;
                if(sum==n){
                    answer++;
                    break;
                }
            }
        }
        
        return answer+1;
    }
}