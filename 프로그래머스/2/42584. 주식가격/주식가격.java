import java.util.Stack;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<prices.length;i++){
            while(!stack.isEmpty()&&prices[i]<prices[stack.peek()]){
                //현재 가격 < 스택에 있는 가격
                int index = stack.pop();
                answer[index] = i-index; //해당 인덱스의 가격이 떨어지지 않은 기간
            }
            stack.push(i);
        }
        //남아있는 인덱스 -> 배열의 끝까지의 기간
        while(!stack.isEmpty()){
            int index=stack.pop();
            answer[index] = prices.length - index - 1;
        }
        
        return answer;
    }
}