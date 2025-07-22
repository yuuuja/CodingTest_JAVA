import java.util.*;
class Solution {
    static class Point{
        int r,c;
        Point(int r, int c){
            this.r = r;
            this.c = c;
        }
        @Override
        public String toString(){
            return r+","+c;
        }
    }
    public int solution(int[][] points, int[][] routes) {
        int robot = routes.length;
        Map<Integer, Point> pointMap = new HashMap<>();
        for(int i=0;i<points.length;i++){
            pointMap.put(i+1, new Point(points[i][0], points[i][1]));
        }
        
        // 각 로봇의 시간별 위치 저장
        List<List<String>> robotPaths = new ArrayList<>();
        int maxTime = 0;
        
        for(int[] route : routes){
            List<String> path = new ArrayList<>();
            Point cur = pointMap.get(route[0]);
            path.add(cur.toString());
            
            for(int i=1;i<route.length;i++){
                Point target = pointMap.get(route[i]);
                
                //r좌표 먼저 이동
                while(cur.r != target.r) {
                    cur = new Point(cur.r+Integer.compare(target.r, cur.r), cur.c); //r값이 같아질 때까지 +1 또는 -1씩 이동
                    path.add(cur.toString());
                }
                //c좌표 이동
                while(cur.c != target.c){
                    cur = new Point(cur.r, cur.c+Integer.compare(target.c, cur.c));
                    path.add(cur.toString());
                }
            }
            
            robotPaths.add(path);
            maxTime = Math.max(maxTime, path.size());
        }
        
        int danger = 0;
        
        for(int t=0;t<maxTime;t++){
            // 특정 시간 t에 로봇들이 어떤 좌표에 있는지
            Map<String, Integer> counter = new HashMap<>();
            
            for(List<String> path:robotPaths){
                String pos = t<path.size()?path.get(t):null;
                if(pos != null){
                    counter.put(pos, counter.getOrDefault(pos, 0) +1);
                }
            }
            
            for(int c: counter.values()){
                if(c>=2) danger++;
            }
        }
        return danger;
    }
}