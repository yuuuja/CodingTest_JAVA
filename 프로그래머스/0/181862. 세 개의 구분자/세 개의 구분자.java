import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<String>();
        String[] arr = myStr.split("[abc]");
        for(String str : arr){
            if(str != null && !str.isEmpty()){
                list.add(str);
            } 
        }
        if(arr.length == 0){
            list.add("EMPTY");
        }
        String[] answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}