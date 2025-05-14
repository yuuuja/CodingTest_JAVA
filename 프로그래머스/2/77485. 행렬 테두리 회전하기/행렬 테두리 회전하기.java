import java.util.*;
class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        // 행렬 초기화
        int[][] matrix = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j] = i*columns+j+1;
            }
        }
        // 행렬 테두리 회전
        // 테두리 따라 한 칸씩 이동하며 값 복사
        // 최솟값 리스트에 저장
        List<Integer> list = new ArrayList<>();
        
        for(int[] rotate : queries){
            int x1 = rotate[0]-1, y1 = rotate[1]-1, x2 = rotate[2]-1, y2 = rotate[3]-1;
            int temp = matrix[x1][y1];
            int min = temp;
            
            // 위
		    for(int i=x1; i<x2; i++) {
		    	matrix[i][y1] = matrix[i + 1][y1];
		    	min = Math.min(min, matrix[i][y1]);
		    }
		    // 아래
	    	for(int i=y1; i<y2; i++) {
		    	matrix[x2][i] = matrix[x2][i + 1];
		    	min = Math.min(min, matrix[x2][i]);
	    	}
	    	// 오른쪽
	    	for(int i=x2; i>x1; i--) {
	    		matrix[i][y2] = matrix[i - 1][y2];
		    	min = Math.min(min, matrix[i][y2]);
	    	}
		    // 왼쪽
		    for(int i=y2; i>y1; i--) {
		     	matrix[x1][i] = matrix[x1][i - 1];
		    	min = Math.min(min, matrix[x1][i]);
		    }
            
            matrix[x1][y1+1] = temp; // temp 복구
            
            list.add(min);
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}