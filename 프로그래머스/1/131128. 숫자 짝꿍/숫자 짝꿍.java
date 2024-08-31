import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        Map<Character, Integer> x_map = new HashMap<>();
        Map<Character, Integer> y_map = new HashMap<>();
        for(char c: X.toCharArray()){
            x_map.put(c,x_map.getOrDefault(c,0)+1);
        }
        for(char c:Y.toCharArray()){
            y_map.put(c,y_map.getOrDefault(c,0)+1);
        }
        StringBuilder answer = new StringBuilder();
        
        for(char c='9';c>='0';c--){
            if(x_map.containsKey(c) && y_map.containsKey(c)){ //공통된 키 찾기 
                int mincnt = Math.min(x_map.get(c),y_map.get(c));
                for(int i=1;i<=mincnt;i++){ //최소 횟수만큼 문자열에 추가
                    answer.append(c);
                }
            }
        }
        if(answer.length() == 0){
            return "-1";
        } else if(answer.charAt(0)=='0'){ //0으로만 구성
            return "0";
        } else{
            return answer.toString();
        }
        
    }
}