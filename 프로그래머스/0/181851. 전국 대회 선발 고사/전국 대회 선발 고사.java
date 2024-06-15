import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[][] arr = new int[rank.length][2];
        for(int i=0;i<rank.length;i++){
            arr[i][0]=rank[i];
            arr[i][1]=i;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr,(a,b)->a[0]-b[0]); //람다를 이용해서 2차원 배열 오름차순 정렬
        for (int i = 0; i <arr.length ; i++) {
            if(attendance[arr[i][1]]){
                list.add(arr[i][1]);
            }
        }
        int answer = 10000 * list.get(0) + 100 * list.get(1) + list.get(2);
        return answer;
    }
}