import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String newstr = my_string.trim().replaceAll("\\s+"," ");
        String[] answer = newstr.split(" ");
        return answer;
    }
}