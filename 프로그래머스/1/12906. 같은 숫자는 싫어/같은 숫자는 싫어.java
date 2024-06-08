import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            if(i==arr.length-1||arr[i]!=arr[i+1]){
                list.add(arr[i]);
            }
            else{
                continue;
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();

        return answer;
    }
}