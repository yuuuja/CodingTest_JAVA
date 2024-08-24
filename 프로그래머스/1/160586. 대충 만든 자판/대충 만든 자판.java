import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(String s : keymap){
            for(int i=0;i<s.length();i++){
                //현재 인덱스와 기존 인덱스 중 최솟값을 저장하여 현재 문자의 최소 인덱스 찾기
                char c = s.charAt(i);
                map.put(c,Math.min(map.getOrDefault(c, Integer.MAX_VALUE),i+1));
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        
        for(String t : targets){
            int sum = 0;
            for(char c : t.toCharArray()){
                if(map.containsKey(c)){
                    sum+=map.get(c);
                } else{
                    sum = -1;
                    break;
                }
            }
            list.add(sum);
            
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}