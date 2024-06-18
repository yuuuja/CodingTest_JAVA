import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i=0;i<strArr.length;i++){
            if(!strArr[i].contains("ad")){
                list.add(strArr[i]);
            }
        }
        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
}
