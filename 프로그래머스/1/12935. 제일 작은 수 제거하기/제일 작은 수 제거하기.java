import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        if(arr.length==1){
            return new int[] {-1};
        }
        
        for(int num:arr){
            if(min>num){
                min = num;
            }
            list.add(num);
        }
        list.remove(Integer.valueOf(min));
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}