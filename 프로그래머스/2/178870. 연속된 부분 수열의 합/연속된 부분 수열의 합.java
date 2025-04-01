import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int left = 0, right = 0, sum = 0;
        int minLength = Integer.MAX_VALUE;
        int[] answer = new int[2]; //시작 인덱스, 끝 인덱스
        
        while(right <= sequence.length){
            if(sum < k) {
                if(right == sequence.length) break;
                sum += sequence[right++];
            } else{
                if(sum==k){
                    if(right - left < minLength){
                        minLength = right-left;
                        answer[0] = left;
                        answer[1] = right-1;
                    }
                }
                sum-=sequence[left++];
            }
        }
        
        return answer;
    }
}