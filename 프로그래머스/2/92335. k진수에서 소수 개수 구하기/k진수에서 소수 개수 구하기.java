class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String P = Integer.toString(n, k);
        for(String s : P.split("0",-1)){
            if(!s.isEmpty() && isPrime(Long.parseLong(s))){
                answer++;
            }
        }
        return answer;
    }
    private boolean isPrime(long num){
        if(num < 2) return false;
        if(num == 2 || num == 3) return true;
        if(num % 2 == 0 || num % 3 == 0) return false;
        // 6의 배수 ± 1로 소수 판별
        for(long i=5;i*i<=num;i+=6){
            if(num % i==0 || num % (i+2) == 0) return false;
        }
        return true;
    }
}