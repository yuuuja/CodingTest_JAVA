class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a){
            n = n - (n/a) + (n/a)*b;
            answer += (n/a)*b;
        }
        return answer;
    }
}