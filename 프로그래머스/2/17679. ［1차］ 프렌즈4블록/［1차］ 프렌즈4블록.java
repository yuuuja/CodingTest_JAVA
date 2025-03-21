import java.util.*;
class Solution {
    public int solution(int m, int n, String[] board) {
        String[][] boards = new String[m][n];
        int answer = 0;
        
        //2차원 배열로 변환
        for(int i=0;i<board.length;i++){
            boards[i] = board[i].split("");
        }
        
        while(true){
            boolean[][] marked = new boolean[m][n]; // 지울 위치
            boolean found = false;
            
            // 2x2 블록 찾기
            for(int i=0;i<m-1;i++){
                for(int j=0;j<n-1;j++){
                    String s = boards[i][j];
                
                    if(s.equals(" ")) continue;
                
                    if(s.equals(boards[i+1][j]) && s.equals(boards[i][j+1]) && s.equals(boards[i+1][j+1])){     
                    
                        marked[i][j] = true;
                        marked[i][j + 1] = true;
                        marked[i + 1][j] = true;
                        marked[i + 1][j + 1] = true;
                        found = true;
                    }
                }
            }
            // 더 이상 지울 블록이 없으면 종료
            if (!found) break;
            
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (marked[i][j]) {
                        boards[i][j] = " ";
                        answer++;
                    }
                }
            }
            
            // 블록 지우고 아래로 떨어뜨리기
            for(int j=0;j<n;j++){ //각 열
                int emptyRow = m-1;
                for(int i=m-1;i>=0;i--) {
                    if (!boards[i][j].equals(" ")) {
                        boards[emptyRow][j] = boards[i][j];
                        if (emptyRow != i) boards[i][j] = " ";
                        emptyRow--;
                    }
                }
            }

        }
        

        return answer;
    }
}