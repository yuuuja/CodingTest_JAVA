import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<clothes.length;i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0)+1); // 의상 종류 별로 몇 개 있는지 
        }
        int answer = 1;
        for(String key : map.keySet()){ 
            answer *= (map.get(key)+1);// 안입는 경우 고려해서 +1
        }
        answer-=1; // 최소 한개 의상은 입으므로 모두 안입는 경우 제외
        return answer;
    }
}