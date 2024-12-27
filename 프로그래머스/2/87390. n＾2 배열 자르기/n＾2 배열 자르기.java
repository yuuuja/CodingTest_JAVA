class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];
        
        for(long i=left;i<=right;i++){
            int row = (int)(i / n); //행 인덱스
            int column = (int)(i % n); //열 인덱스
            answer[(int)(i-left)]=Math.max(row,column)+1;
        }
        return answer;
    }
}