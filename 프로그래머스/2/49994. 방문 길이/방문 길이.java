import java.util.*;
class Solution {
    public int solution(String dirs) {
        int[] dx = {0,0,1,-1}; //U,D,R,L
        int[] dy = {1,-1,0,0};
        Set<String> visitedPath = new HashSet<>(); //이동 경로 저장
        
        Map<String, Integer> dirMap= new HashMap<>();
        dirMap.put("U",0);
        dirMap.put("D",1);
        dirMap.put("R",2);
        dirMap.put("L",3);
        
        int x=0;
        int y=0;
        
        for(char d : dirs.toCharArray()){
            int idx = dirMap.get(String.valueOf(d));
            int nx = x + dx[idx];
            int ny = y + dy[idx];
            
            if (nx >= -5 && ny >= -5 && nx <= 5 && ny <= 5) { // 좌표 범위 확인
                // 방문 경로 저장 (출발 -> 도착 & 도착 -> 출발을 저장하여 중복 방지)
                String path1 = x + "," + y + " -> " + nx + "," + ny;
                String path2 = nx + "," + ny + " -> " + x + "," + y;

                visitedPath.add(path1);
                visitedPath.add(path2);

                // 좌표 이동
                x = nx;
                y = ny;
            }
            
        }
        return visitedPath.size() / 2;
        
    }

}