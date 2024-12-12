class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        while(a!=b){
            ++answer;
            a = getResultByOddEven(a)/2;
            b = getResultByOddEven(b)/2;
        }
        return answer;
    }
    public int getResultByOddEven(int number) {
        if (number % 2 != 0) {
            return number+1;
        } else{
            return number;
        }
    }
}