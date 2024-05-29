import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=n-1;i<num_list.length;i++){
            arr.add(num_list[i]);
        }
        
        int[] answer = arr.stream().mapToInt(i->i).toArray();
        return answer;
    }
}