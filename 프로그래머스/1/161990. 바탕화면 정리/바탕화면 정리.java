import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        List<Point> points = new ArrayList<>();
        int minX=50; int minY=50;
        int maxX=0; int maxY=0;
        
        // 파일 좌표 리스트에 저장
        for(int i=0;i<wallpaper.length;i++){
            String[] str = wallpaper[i].split("");
            for(int j=0;j<str.length;j++){
                if(str[j].equals("#")){
                    points.add(new Point(j,i));
                }
            }
        }
        // 최대, 최소 x좌표, y좌표 구하기
        for(Point point : points){
            if (point.getX() < minX) minX = point.getX();
            if (point.getX() > maxX) maxX = point.getX();
            if (point.getY() < minY) minY = point.getY();
            if (point.getY() > maxY) maxY = point.getY();
        }
          
        int[] answer = {minY, minX, maxY+1, maxX+1};
        return answer;
    }
}
class Point{
    private int x;
    private int y;
    
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}