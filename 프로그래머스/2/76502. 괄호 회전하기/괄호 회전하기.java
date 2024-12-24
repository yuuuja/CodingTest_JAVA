import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i=0;i<s.length();i++){
            if(parenthesesCheck(s)){
                answer++;
            }
            s = s.substring(1) + s.charAt(0);
        }
        return answer;
    }
    public boolean parenthesesCheck(String s){
        Stack<String> stack = new Stack<>();
        for(String str : s.split("")){
            if(str.equals("(")||str.equals("{")||str.equals("[")){
                stack.push(str);
            } else if (str.equals(")") || str.equals("}") || str.equals("]")) {
                if (stack.isEmpty()) {
                    return false;
                }
            
                if ((str.equals(")") && stack.peek().equals("(")) ||
                    (str.equals("}") && stack.peek().equals("{")) ||
                    (str.equals("]") && stack.peek().equals("["))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}