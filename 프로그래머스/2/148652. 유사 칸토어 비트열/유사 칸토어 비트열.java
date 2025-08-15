class Solution {
    public int solution(int n, long l, long r) {
        int answer = (int)(count(n,r)-count(n,l-1));
        return answer;
    }
    //n번째 피트열에서 k까지 1의 개수
    private long count(int n, long k){
        if(n==0){
            return 1;
        }
        long preBitStringNumber = n - 1;
        long divisor = (long) Math.pow(5, preBitStringNumber);
        long numberOfOne = (long) Math.pow(4, preBitStringNumber);
 
        long zone = (int) (k / divisor);
        if((k % divisor) == 0) zone--;
 
        if (zone == 2) {
            // 0만 있는 구역
            return numberOfOne * zone;
        } else if (zone < 2) {
            // 0 이전 구역
            return numberOfOne * zone + count(n - 1, k - (divisor * zone));
        } else {
            return numberOfOne * (zone - 1) + count(n - 1, k - (divisor * zone));
        }
    }
}