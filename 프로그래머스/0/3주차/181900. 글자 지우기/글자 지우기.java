import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        ArrayList<Character> str = new ArrayList<>();
        for (char ch : my_string.toCharArray()) {
            str.add(ch);
        }
        Arrays.sort(indices);
        for(int i = indices.length - 1; i >= 0; i--){ //
            str.remove(indices[i]);
        } 
        
        StringBuilder answer = new StringBuilder();
        for(char ch : str){
            answer.append(ch);
        }
        
        return answer.toString();
    }
}
