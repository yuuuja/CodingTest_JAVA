class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] x = {1,0,-1,0};
        int[] y = {0,1,0,-1};
        for(int i=0;i<x.length;i++){
            int newH = h+x[i];
            int newW = w+y[i];
            if(newH >= 0  && newH < board.length && newW>=0 && newW<board[0].length){
                if(board[h][w].equals(board[newH][newW])){
                    answer++;
                }
            }
        }
        return answer;
    }
}