import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        
        //알파벳 리스트
        List<Character> alphabet = new ArrayList<>();
        for(char ch = 'a';ch<='z';ch++){
            alphabet.add(ch);
        }
        
        //skip에 있는 알파벳 리스트 제거
        for(char c:skip.toCharArray()){
            alphabet.remove(Character.valueOf(c));
        }
        
        for(char c:s.toCharArray()){
            //현재 문자의 인덱스
            int currentIndex = alphabet.indexOf(c);
            //index만큼 이동 후 인덱스
            int newIndex = (currentIndex + index) % alphabet.size(); //'z'->'a'
            
            sb.append(alphabet.get(newIndex));
        }
        return sb.toString();
    }
}