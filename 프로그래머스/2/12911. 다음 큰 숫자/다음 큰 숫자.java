class Solution {
    public int solution(int n) {
        int count = count_one(n);
        int nextNum = n+1;
        
        while(true){
            if(count == count_one(nextNum)){
                return nextNum;
            }
            nextNum++;
        }
    }
    private int count_one(int n){
        int cnt = 0;
        while(n!=0){
            cnt += n & 1;
             n >>= 1; //오른쪽으로 1비트 이동
        }
        return cnt;
    }
}