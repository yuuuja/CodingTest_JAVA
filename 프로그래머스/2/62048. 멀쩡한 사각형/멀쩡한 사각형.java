import java.util.*;
class Solution {
    public long solution(int w, int h) {
        long W = w;
        long H = h;
        long gcd = getGCD(W,H);
        
        // W와 H가 소수일 때 대각선은 W+H-1개의 정사각형을 지남
        // GCD × (W/GCD + H/GCD - 1)
        return W*H - (W+H-gcd);
    }
    private long getGCD(long a, long b) {
        while(b!=0){
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}