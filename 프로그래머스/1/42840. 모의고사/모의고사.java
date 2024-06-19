import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        int cnt_a=0, cnt_b=0, cnt_c=0;
        for(int i=0;i<answers.length;i++){ //각각 맞힌 개수 구하기
            if(answers[i]==a[i%5]) cnt_a++;
            if(answers[i]==b[i%8]) cnt_b++;
            if(answers[i]==c[i%10]) cnt_c++;
        }
        int max = Math.max(cnt_a, Math.max(cnt_b,cnt_c));
        ArrayList<Integer> result = new ArrayList<>();
        
        if(cnt_a == max) result.add(1);
        if(cnt_b == max) result.add(2);
        if(cnt_c == max) result.add(3);
        
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size();i++){
            answer[i]=result.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}