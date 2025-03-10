import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int num=1;
        Stack<Integer> container = new Stack<>();
        while(num <= order[0]){
            container.push(num++);
        }
        
        for(int i=0;i<order.length;i++){
            while(container.isEmpty() || order[i]>container.peek()){
                container.push(num++);
            }
            if(!container.isEmpty() && order[i]==container.peek()){
                answer++;
                container.pop();
            } else{
                return answer;
            }
        }
        return answer;
    }
}