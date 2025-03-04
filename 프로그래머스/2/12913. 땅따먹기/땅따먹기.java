class Solution {
    int solution(int[][] land) {
        int answer = 0;
        for(int i=1;i<land.length;i++){            
            for(int j=0;j<4;j++){
                int maxPrev = Integer.MIN_VALUE; 
                for(int k=0;k<4;k++){
                    if(k != j){ // 같은 열 선택 X
                        maxPrev = Math.max(maxPrev, land[i-1][k]);
                    }
                }
                land[i][j] += maxPrev; //같은 열을 제외한 최댓값을 누적합함
            }
        }
        for(int j=0;j<4;j++){
            answer = Math.max(answer, land[land.length-1][j]);
        }

        return answer;
    }
}