import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int num : arr){
            result.add(num);
        }
        for(int deletenum : delete_list){
            result.remove(Integer.valueOf(deletenum));
        }
        int[] answer = result.stream().mapToInt(i->i).toArray();
        return answer;
    }
}