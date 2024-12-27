class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int A_col = arr1[0].length;
        int A_row = arr1.length;
        int B_col = arr2[0].length;
        int[][] answer = new int[A_row][B_col];
        
        for(int i=0;i<A_row;i++){
            for(int j=0;j<B_col;j++){
                for(int k=0; k<A_col;k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}