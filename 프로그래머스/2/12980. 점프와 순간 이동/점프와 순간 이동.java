import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
         while (n > 0) {// 뒤에서부터
            if (n % 2 == 1) { // 홀수일 때 점프
                ans++;
                n--;
            } else { // 짝수일 때 순간이동
                n /= 2;
            }
        }
        

        return ans;
    }
}