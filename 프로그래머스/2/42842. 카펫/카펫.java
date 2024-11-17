class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2]; //[h,w]
        int total = brown + yellow;
        for(int w = 3; w <= (int) Math.sqrt(total); w++){ //최소 3부터 시작
            if(total % w == 0){
                int h = total / w;
                if((w-2)*(h-2)==yellow){
                    answer[0]=h;
                    answer[1]=w;
                    break;
                }
            }
        }
        return answer;
    }
}