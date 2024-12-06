import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for(int i=1;i<words.length;i++){
            int len = words[i-1].length();
            if((words[i-1].charAt(len-1) == words[i].charAt(0)) && !list.contains(words[i])){
                list.add(words[i]);
            } else{
                answer[0] = (i+1)%n==0 ? n : (i+1)%n;
                answer[1] = (i+1)%n==0 ? (i+1)/n : (i+1)/n+1;
                return answer;
            }
        }
        return new int[]{0,0};
    }
}