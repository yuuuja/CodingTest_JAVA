import java.util.*;
class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        // XOR 두 비트가 다르면 1, 같으면 0 -> XOR연산(^)에서 1의 개수
        for(int i=0;i<numbers.length;i++){
            long num = numbers[i];
                
            if(num %2 ==0){
                answer[i] = num +1;
            } else{
                    
            }
            for(long j=1; ;j*=2){ // j=1,2,4,8 ...
                long xor = num ^ (num+j);
                
                if(Long.bitCount(xor) <= 2) {
                    answer[i] = numbers[i]+j;
                    break;
                }
            }
        }
        return answer;
    }
}