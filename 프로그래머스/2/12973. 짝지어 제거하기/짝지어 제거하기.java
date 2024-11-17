import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;

        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(list.isEmpty()) {
                list.add(s.charAt(i));
            } else{
                if(s.charAt(i)==list.get(list.size() - 1)){
                    list.remove(list.size() - 1);
                } else {
                    list.add(s.charAt(i));
                }
            }
            
        }
        answer = list.size() == 0 ? 1 : 0;
        

        return answer;
    }
}