class Solution {
    public String solution(int n) {
        char[] c = new char[n];
        for(int i=0;i<c.length;i++){
            c[i] = (i%2==0)? '수':'박';
        }
        String answer = String.valueOf(c);
        return answer;
    }
}