import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stagecnt = new int[N+2];//클리어 못한 플레이어수
        int[] playercnt = new int[N+2];//스테이지 도달한 플레이어 수
        
        for(int stage : stages){
            stagecnt[stage]++;
        }
        
        int totalPlayers = stages.length;
        for (int i = 1; i <= N; i++) {
            playercnt[i] = totalPlayers;
            totalPlayers -= stagecnt[i];
        }
        
        HashMap<Integer, Double> map = new HashMap<>();
        
        for(int i=1;i<=N;i++){
            map.put(i,(playercnt[i] == 0) ? 0 : (double)stagecnt[i]/playercnt[i]);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        // 실패율을 기준으로 내림차순 정렬
        list.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1)));

        // 리스트를 배열로 변환하여 반환
        return list.stream().mapToInt(i -> i).toArray();
    }
}