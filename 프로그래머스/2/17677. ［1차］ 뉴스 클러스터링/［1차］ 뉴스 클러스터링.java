import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        for(int i=0;i<str1.length()-1;i++){
            String substring = str1.substring(i, i + 2).toLowerCase();
            if (substring.matches("[a-z]{2}")) {
                list1.add(substring);
            }
        }
        for(int i=0;i<str2.length()-1;i++){
            String substring = str2.substring(i, i + 2).toLowerCase();
            if (substring.matches("[a-z]{2}")) {
                list2.add(substring);
            }
        }
        
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        
        for(String s : list1){
            map1.put(s, map1.getOrDefault(s,0)+1);
        }
        for(String s : list2){
            map2.put(s, map2.getOrDefault(s,0)+1);
        }
        int intersectionSize = 0;
        int unionSize = 0;
        
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                intersectionSize += Math.min(map1.get(key), map2.get(key)); // 작은 값이 교집합 개수
            }
            unionSize += Math.max(map1.get(key), map2.getOrDefault(key, 0)); // 큰 값이 합집합 개수
        }

        // 합집합 계산 (map2에만 있는 원소)
        for (String key : map2.keySet()) {
            if (!map1.containsKey(key)) {
                unionSize += map2.get(key);
            }
        }
        
        double jaccard = (unionSize == 0) ? 1.0 : (double) intersectionSize / unionSize;
        return (int) Math.floor(jaccard * 65536);
    }
}