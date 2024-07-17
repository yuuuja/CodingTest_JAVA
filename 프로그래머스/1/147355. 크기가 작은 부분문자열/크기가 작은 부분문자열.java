class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i=0;i<=t.length()-p.length();i++){
            long num = Long.valueOf(t.substring(i,i+p.length()));
            if(num<=Long.valueOf(p)){
                answer++;
            }
        }
        return answer;
    }
}