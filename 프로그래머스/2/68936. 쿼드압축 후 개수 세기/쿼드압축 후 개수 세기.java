class Solution {
    int zero = 0;
    int one = 0;
    public int[] solution(int[][] arr) {
        int[] answer = {};
        
        compress(arr, 0,0,arr.length);

        return new int[]{zero, one};
    }
    private void compress(int[][] arr, int x, int y, int size){
        if (isAllSame(arr, x, y, size)) {
            if (arr[x][y] == 0) {
                zero++;
            } else {
                one++;
            }
            return;
        }
        int newSize = size / 2;
        compress(arr, x, y, newSize); // 왼쪽 위
        compress(arr, x, y + newSize, newSize); // 오른쪽 위
        compress(arr, x + newSize, y, newSize); // 왼쪽 아래
        compress(arr, x + newSize, y + newSize, newSize); // 오른쪽 아래
    }
    private boolean isAllSame(int[][] arr, int x, int y, int size){
        int base = arr[x][y];
        for(int i=x;i<x+size;i++){
            for(int j=y;j<y+size;j++){
                if (arr[i][j] != base) return false;
            }
        }
        return true;
    }
}