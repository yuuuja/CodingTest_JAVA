import java.util.*;
class Solution {
    static Map<String, Integer> map;
    public String[] solution(String[] orders, int[] course) {
        List<String> result = new ArrayList<>();
        map = new HashMap<>();
        
        for(String order:orders){
            char[] chars = order.toCharArray();
            Arrays.sort(chars); //알파벳 순 정렬
            
            for(int c: course){
                if (c <= chars.length) { // 조합 가능한 경우만
                    combination(chars, 0, 0, c, new StringBuilder());
                }
            }
        }
        
        for (int c : course) {
            int max = 2; // 최소 2번 이상 등장해야 함
            for (String key : map.keySet()) {
                if (key.length() == c) {
                    max = Math.max(max, map.get(key));
                }
            }

            for (String key : map.keySet()) {
                if (key.length() == c && map.get(key) == max) {
                    result.add(key);
                }
            }
        }

        Collections.sort(result);
        return result.toArray(new String[0]);
    }
    void combination(char[] chars, int start, int depth, int target, StringBuilder sb){
        if(depth == target){
            String menu = sb.toString();
            map.put(menu, map.getOrDefault(menu,0)+1);
            return;
        }
        
        for(int i=start;i<chars.length;i++){
            sb.append(chars[i]);
            combination(chars, i+1, depth+1, target, sb);
            sb.deleteCharAt(sb.length() - 1); // 백트래킹
        }
    }
}