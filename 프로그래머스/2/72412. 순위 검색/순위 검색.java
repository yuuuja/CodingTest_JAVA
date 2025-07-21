import java.util.*;
class Solution {
    static Map<String, List<Integer>> map;
    public int[] solution(String[] info, String[] query) {
        
        // 가능한 모든 조건 조합을 map에 저장
        map = new HashMap<>();
        
        for(String s:info){
            String[] split = s.split(" ");
            int score = Integer.parseInt(split[4]);
            dfs(0,"",split,score);
        }
        
        // 점수 리스트 정렬
        for(String key : map.keySet()){
            Collections.sort(map.get(key));
        }
            
        // 쿼리를 map 키 형태로 변환
        int[] answer = new int[query.length];
        
        for(int i=0;i<query.length;i++){
            query[i] = query[i].replaceAll(" and ","");
            String[] q = query[i].split(" ");
            answer[i] = map.containsKey(q[0]) ? binarySearch(q[0], Integer.parseInt(q[1])):0;
        }
        
        return answer;
    }
    private static void dfs(int depth, String key, String[] split, int score){
        if(depth == 4){
            if (!map.containsKey(key)) {
                List<Integer> list = new ArrayList<Integer>();
                map.put(key, list);
            }
            map.get(key).add(score);
            return;
        }
        dfs(depth + 1, key + "-", split, score);
        dfs(depth + 1, key + split[depth], split, score);
    }
    // 이분 탐색
    private static int binarySearch(String key, int score){
        List<Integer> list = map.get(key);
        int start = 0, end = list.size()-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(list.get(mid) < score){
                start = mid +1;
            } else{
                end = mid-1;
            }
        }
        return list.size() - start;
    }
}