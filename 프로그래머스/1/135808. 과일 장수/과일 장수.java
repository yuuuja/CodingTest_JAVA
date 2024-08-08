import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;
        
        for(int i=score.length/m;i>0;i--){
            answer += score[score.length-(m*i)] * m;
        }

        return answer;
    }
}