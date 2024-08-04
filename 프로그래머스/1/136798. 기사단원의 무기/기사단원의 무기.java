class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1;i<=number;i++){
            int count = 0; // 초기화
            for(int j=1;j*j<=i;j++){
                if(j*j == i) //제곱수이면 약수의 개수는 홀수
                    count++;
                else if(i % j == 0)
                    count += 2;
            }
            answer += count > limit ? power : count;
        }
        return answer;
    }
}