import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<names.length;i++){
            if(i%5==0){
                list.add(names[i]);
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
