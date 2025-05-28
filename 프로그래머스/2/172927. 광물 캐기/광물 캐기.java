import java.util.*;
class Solution {
    public int solution(int[] picks, String[] minerals) {
        Map<String, Integer> mineralMap = Map.of("diamond",0,"iron",1,"stone",2);
        int[][] fatigue = {
            {1,1,1}, // diamond
            {5,1,1}, // iron
            {25,5,1} // stone
        };
        
        int totalPicks = picks[0]+picks[1]+picks[2];
        // 광물 5개씩 그룹화
        List<int[]> groups = new ArrayList<>();
        for(int i=0;i<minerals.length && groups.size() < totalPicks;i+=5){
            int[] count = new int[3];
            for(int j=i;j<i+5 && j<minerals.length;j++){
                count[mineralMap.get(minerals[j])]++;
            }
            groups.add(count);
        }
        
        // 피로도 점수 높은 그룹 먼저 정렬
        groups.sort((a,b) -> {
            int scoreA = a[0] * 25 + a[1] * 5 + a[2];
            int scoreB = b[0] * 25 + b[1] * 5 + b[2];
            return scoreB - scoreA;
        });
        
        // 곡괭이 사용하면서 피로도 누적
        int fatigueTotal = 0;
        int groupIndex = 0;
        
        for(int i =0;i<3;i++){
            while(picks[i] > 0 && groupIndex <groups.size()){
                int[] group = groups.get(groupIndex++);
                for(int j=0;j<3;j++){
                    fatigueTotal += fatigue[i][j] * group[j];
                }
                picks[i]--;
            }
        }
        return fatigueTotal;
    }
}