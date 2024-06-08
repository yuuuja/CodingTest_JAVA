class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int index = 0;
        while((index=myString.indexOf(pat,index))!=-1){ //indexof(찾을문자, 시작위치)
            answer++;
            index += 1; //다음 검색 시작 위치 이동
        }
        return answer;
    }
}