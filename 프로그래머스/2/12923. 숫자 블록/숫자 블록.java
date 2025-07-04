import java.util.*;
class Solution {
    public int[] solution(long begin, long end) {
        int length = (int)(end - begin + 1);
        int[] answer = new int[length];

        for (long i = begin; i <= end; i++) {
            answer[(int)(i - begin)] = block(i);
        }

        return answer;
    }
    // 자기 자신을 제외한 최대 약수 찾기
    public int block(long n){
        if (n == 1) return 0;

        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                long pair = n / i;
                if (pair <= 10_000_000) {
                    return (int)pair;
                }
            }
        }

        // 작은 쪽 약수는 마지막에 따로
        for (long i = (long)Math.sqrt(n); i >= 2; i--) {
            if (n % i == 0 && i <= 10_000_000) {
                return (int)i;
            }
        }

        return 1;
    }
}