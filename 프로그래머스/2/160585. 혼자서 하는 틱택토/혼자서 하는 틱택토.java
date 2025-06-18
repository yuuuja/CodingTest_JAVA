import java.util.*;
class Solution {
    public int solution(String[] board) {
        int Ocnt = 0;
        int Xcnt = 0;
        for(int i=0;i<board.length;i++){
            Ocnt += count(board[i],'O');
            Xcnt += count(board[i],'X');
        }
        
        if(Xcnt > Ocnt) return 0;
        if(Ocnt-Xcnt >= 2) return 0;
        // O가 완성되었을 때 X개수가 O개수가 같은 경우
        if(iscompleted(board, 'O')){
            if(Ocnt == Xcnt) return 0;
        }
        // X가 완성되었을 때 O개수가 X보다 많은 경우
        if(iscompleted(board, 'X')){
            if(Ocnt > Xcnt) return 0;
        }
        return 1;
    }
    private static int count(String s, char c){
        return s.length() - s.replace(String.valueOf(c),"").length();
    }
    // 완성여부
    private static boolean iscompleted(String[] board, char ch){
        //가로
        for(int i=0;i<3;i++){
            if (board[i].charAt(0) == ch
                    && board[i].charAt(1) == ch
                    && board[i].charAt(2) == ch) {
                return true;
            }
        }
        //세로
        for(int i=0;i<3;i++){
            if (board[0].charAt(i) == ch
                    && board[1].charAt(i) == ch
                    && board[2].charAt(i) == ch) {
                return true;
            }
        }
        //대각선
        if (board[0].charAt(0) == ch
                && board[1].charAt(1) == ch
                && board[2].charAt(2) == ch) {
            return true;
        }
        if (board[0].charAt(2) == ch
                && board[1].charAt(1) == ch
                && board[2].charAt(0) == ch) {
            return true;
        }
        return false;
    }
}