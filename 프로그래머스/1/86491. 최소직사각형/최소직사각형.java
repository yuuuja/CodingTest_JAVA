class Solution {
    public int solution(int[][] sizes) {
        int[][] arr = new int[sizes.length][2];
        for(int i=0;i<sizes.length;i++){
            arr[i][0]=Math.max(sizes[i][0],sizes[i][1]);
            arr[i][1]=Math.min(sizes[i][0],sizes[i][1]);
        }
        int max_long = 0;
        int max_short = 0;
        for(int i=0;i<arr.length;i++){
            if(max_long < arr[i][0]){
                max_long = arr[i][0];
            }
            if(max_short < arr[i][1]){
                max_short = arr[i][1];
            }
        }
        
        return max_long * max_short;
    }
}