import java.util.*;
class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        
        int standard = col-1;
        Arrays.sort(data, (o1,o2)->{
            if(o1[standard] == o2[standard]) return o2[0]-o1[0]; //첫번째 컬럼 기준 내림차순
            return o1[standard]-o2[standard]; //오름차순
        });
        
        for(int i = row_begin -1;i<row_end;i++){
            int sum = 0;
            int n = i+1;
            
            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j] % n;
            }
            
            answer = (answer ^ sum);
        }
        return answer;
    }
}