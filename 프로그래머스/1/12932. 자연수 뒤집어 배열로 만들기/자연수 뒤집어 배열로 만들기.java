class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        int i = 0;
        while(n>0){
            answer[i]=(int)(n%10);
            i++;
            n=n/10;
        }
        return answer;
    }
}