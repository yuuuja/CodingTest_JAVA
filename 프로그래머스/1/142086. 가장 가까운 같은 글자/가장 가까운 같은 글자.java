class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alpha = new int[26]; //최신 위치 저장
        for(int i=0;i<26;i++){
            alpha[i]=-1; //-1로 초기화
        }
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(alpha[c-'a']==-1){ //처음 나온 문자
                answer[i]=-1;
            } else{ //이전에 나온 문자
                answer[i]=i-alpha[c-'a'];
            }
            alpha[c-'a']=i;//현재위치저장
        }
        return answer;
    }
}