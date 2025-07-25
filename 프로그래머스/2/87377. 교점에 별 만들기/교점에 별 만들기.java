import java.util.*;
class Solution {
    static class Point{
        long x, y;
        Point(long x, long y){
            this.x = x;
            this.y = y;
        }
        void setX(long x){
            this.x = x;
        }
        void setY(long y){
            this.y = y;
        }
    }
    public String[] solution(int[][] line) {
        List<Point> pList = new ArrayList<>(); //교점을 저장할 좌표 리스트
        // 교점 저장
        for(int i=0;i<line.length-1;i++){
            for(int j = i+1;j<line.length;j++){
                long a = line[i][0], b= line[i][1], e=line[i][2];
                long c = line[j][0], d= line[j][1], f=line[j][2];
                
                if((a*d-b*c)!=0){
                    double x = (double)(b*f - e*d) / (a*d - b*c);
                    double y = (double)(e*c - a*f) / (a*d - b*c);
                    if(x % 1 == 0 && y % 1 == 0){  //정수인 경우에만 저장
                        pList.add(new Point((long)x, (long)y));   
                    }
                }
            }
        }
        // 교점의 최소, 최댓값 찾기
        Point min = new Point(Long.MAX_VALUE, Long.MAX_VALUE);
        Point max = new Point(Long.MIN_VALUE, Long.MIN_VALUE);
        
        for(Point p:pList){
            long cx = p.x, cy = p.y;
            
            if(cx < min.x)  min.setX(cx);
            
            if(cy < min.y)  min.setY(cy);
            
            if(cx > max.x)  max.setX(cx);
            
            if(cy > max.y)  max.setY(cy);
        }
        
        // 격자판 크기 산출 후 격자판 배열 선언
        int width = (int)(max.x - min.x+1);
        int height = (int)(max.y - min.y+1);
        
        char[][] arr = new char[height][width];
        
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                arr[i][j]='.';
            }
        }
        
        for(Point p:pList){
            arr[(int)(max.y - p.y)][(int)(p.x - min.x)] = '*';
        }
        //답변배열 생성 후 격자판 문자열로 변환하여 저장
        String[] answer = new String[height];
        for(int i = 0; i < answer.length; i++){
            answer[i] = new String(arr[i]);
        }
        return answer;
    }
}