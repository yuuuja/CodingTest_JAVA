import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        Arrays.sort(answer);
        for(String s : answer){
            if(!s.isEmpty()){
                list.add(s);
            }
        }
        
        return list.toArray(new String[list.size()]);
    }
}