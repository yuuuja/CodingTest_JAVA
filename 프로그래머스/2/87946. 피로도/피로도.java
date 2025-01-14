import java.util.*;
class Solution {
    private int answer = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        //int answer = 0;
        explore(k, dungeons, visited, 0);
        return answer;
    }
    private void explore(int fatigue, int[][] dungeons, boolean[] visited, int count){
        answer = Math.max(answer, count);
        
        for(int i=0;i<dungeons.length;i++){
            if(!visited[i] && fatigue>=dungeons[i][0]){
                visited[i] = true;
                explore(fatigue-dungeons[i][1], dungeons, visited, count+1);
                visited[i] = false;
            }
             
            
        }
    }
}