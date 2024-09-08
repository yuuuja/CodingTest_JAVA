class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        // 키패드 좌표
        int[][] keypad = {
            {3,1}, //0
            {0,0},{0,1},{0,2}, //1,2,3
            {1,0},{1,1},{1,2}, //4,5,6
            {2,0},{2,1},{2,2}, //7,8,9
        };
        int[] left = {3,0};// 초기 왼손 손위치
        int[] right = {3,2}; // 초기 오른손 손위치
        
        for(int num : numbers){
            if(num == 1 || num == 4 || num ==7){
                sb.append("L");
                left = keypad[num];
            } else if(num == 3 || num == 6 || num ==9){
                sb.append("R");
                right = keypad[num];
            } else{ // 2,5,8,0 -> 맨해튼 거리로
                int L_distance = Math.abs(left[0] - keypad[num][0])+Math.abs(left[1] - keypad[num][1]);
                int R_distance = Math.abs(right[0] - keypad[num][0])+Math.abs(right[1] - keypad[num][1]);
                if(L_distance < R_distance){
                    sb.append("L");
                    left = keypad[num];
                } else if(L_distance > R_distance){
                    sb.append("R");
                    right = keypad[num];
                } else{ // 같으면 손잡이에 따라서 
                    if(hand.equals("right")){
                        sb.append("R");
                        right = keypad[num];
                    } else{
                        sb.append("L");
                        left = keypad[num];
                    }
                }
            }
        }
        
        return sb.toString();
    }
}