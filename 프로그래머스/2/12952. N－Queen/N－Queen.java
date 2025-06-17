import java.util.*;
class Solution {
    int answer = 0;
    boolean[] colUsed; // 같은 열 체크
    boolean[] diag1; //오른쪽 아래 대각선 방향 체크
    boolean[] diag2; //왼쪽 아래 대각선 방향 체크
    public int solution(int n) {
        // 서로 다른 행에 1개씩만 두면서 열/대각선에 겹치지 않게 배치
        colUsed = new boolean[n];
        diag1 = new boolean[2*n];
        diag2 = new boolean[2*n];
        
        backtrack(0,n);
        
        return answer;
    }
    private void backtrack(int row, int n){
        if(row == n){
            answer++;
            return;
        }
        
        for(int i=0;i<n;i++){
            if(colUsed[i]||diag1[row+i]||diag2[row-i+n]){
                continue;
            }
            colUsed[i] = diag1[row + i] = diag2[row - i + n] = true;
            backtrack(row + 1, n);
            colUsed[i] = diag1[row + i] = diag2[row - i + n] = false;
        }
    }
}