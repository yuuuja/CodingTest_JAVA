import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int i=0;i<intervals.length;i++){
            int a = intervals[i][0];
            int b = intervals[i][1];
            for(int j=a;j<=b;j++){
                al.add(arr[j]);
            }
            
        }
        int[] answer = new int[al.size()];
        for(int i=0;i<al.size();i++){
            answer[i]=al.get(i);
        }
        return answer;
    }
}