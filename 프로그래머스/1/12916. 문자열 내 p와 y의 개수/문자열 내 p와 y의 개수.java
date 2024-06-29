class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_cnt = 0;
        int y_cnt = 0;
        for(int i = 0; i<s.length();i++){
            if(s.toLowerCase().charAt(i)=='p'){
                p_cnt++;
            }
            if(s.toLowerCase().charAt(i)=='y'){
                y_cnt++;
            }
        }
        answer = p_cnt==y_cnt?true:false;

        return answer;
    }
}