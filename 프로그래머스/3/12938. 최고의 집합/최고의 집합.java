import java.util.*;
class Solution {
    public int[] solution(int n, int s) {
        //최대 곱
        if(n>s) return new int[]{-1};
        
        int[] answer = new int[n];
        for(int i=0;i<n;i++){
            answer[i] = s/n;
        }
        // n=3, s=11 -> 나머지가 2이므로 뒤에서부터 2번째 원소까지 1을 더해주면 [3, 4, 4] 가 된다
        int remain = s%n;
        for(int i=n-1;i>=n-remain;i--){
            answer[i] += 1;
        }
        return answer;
    }
}