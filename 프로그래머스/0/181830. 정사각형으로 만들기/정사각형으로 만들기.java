class Solution {
    public int[][] solution(int[][] arr) {
        int len = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[len][len];
        if(arr.length>arr[0].length){
            for(int i = 0; i<answer.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    answer[i][j]=arr[i][j];
                }
                for(int j=arr[0].length;j<answer.length;j++){
                    answer[i][j]=0;
                }
            }
        } else{
            for (int i = 0; i < arr.length ; i++) {
                for(int j=0;j<answer.length;j++){
                    answer[i][j]=arr[i][j];
                }
            }
            for(int i=arr.length;i<answer.length;i++){
                for(int j=0;j<answer.length;j++){
                    answer[i][j]=0;
                }
            }
            
        }
        return answer;
    }
}