class Solution {
    public int solution(String num_str) {
        char[] c= num_str.toCharArray();
        int answer = 0;
        for(int i=0;i<c.length;i++){
            answer+=(int)c[i]-48;
        }
        
        return answer;
    }
}