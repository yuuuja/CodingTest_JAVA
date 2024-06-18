import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        ArrayList<Integer> list = new ArrayList<>();
        int[] k_arr = Arrays.stream(arr).distinct().toArray(); //중복값제거
        int i;
        for(i=0;i<k_arr.length&&i<k;i++){
            answer[i]=k_arr[i];
        }
        for(;i<k;i++){ //나머지 -1로 채움
            answer[i]=-1;
        }
        
        return answer;
    }
}
