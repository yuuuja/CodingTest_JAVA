class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num =1;
        int right=-1;
        int top =1;
        int bottom = 0;
        for(int i=n;i>0;i--){
            for(int j=0;j<n;j++){
                right += top;
                answer[bottom][right]=num;
                num++;
            }
            n--;
            for(int j=0;j<n;j++){
                bottom+=top;
                answer[bottom][right]=num;
                num++;
            }
            top*=-1;
        }
        
        
        return answer;
    }
}