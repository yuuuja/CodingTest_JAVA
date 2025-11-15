import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        
        Arrays.sort(routes, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                // 끝 지점 기준으로 정렬
                return o1[1] - o2[1];
            }
        });
        
        int camera = (-1) * (30_001);
        for (int[] route : routes) {
            int s = route[0];
            int e = route[1];

            // 이전 카메라가 설치한 곳에서 볼 수 없을 때
            if(s > camera){
                // 카메라를 끝 지점에 설치
                camera = e;
                answer++;
            }
        }
        
        return answer;
    }
}