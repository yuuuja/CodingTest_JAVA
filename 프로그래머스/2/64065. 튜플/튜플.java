import java.util.*;
class Solution {
    public int[] solution(String s) {
        
        s = s.replaceAll("[^0-9,]","");

        Map<Integer, Integer> map = new HashMap<>();

        for(String str: s.split(",")){
            int num = Integer.parseInt(str);
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((e1,e2) -> e2.getValue().compareTo(e1.getValue())); //내림차순

        int[] answer = new int[entryList.size()];
        
        for(int i=0;i<answer.length;i++){
            answer[i] = entryList.get(i).getKey();
        }
        return answer;
    }
}