import java.util.*;
import java.util.stream.*;
class Solution {
    public long solution(String expression) {
        long answer = 0;
        
        // 숫자 연산자 분리
        String[] numStr = expression.split("[^0-9]");
        List<Long> numbers = Arrays.stream(numStr)
            .map(Long::parseLong)
            .collect(Collectors.toList());
        
        List<Character> operators = new ArrayList<>();
        for(char c : expression.toCharArray()){
            if(c=='+'||c=='-'||c=='*'){
                operators.add(c);
            }
        }
        // 연산자 우선순위 순열 생성
        
        char[][] opOrders = {
            {'+', '-', '*'},
            {'+', '*', '-'},
            {'-', '+', '*'},
            {'-', '*', '+'},
            {'*', '+', '-'},
            {'*', '-', '+'}
        };
        
        for(char[] order:opOrders){
            //원본 리스트 복사
            List<Long> nums = new ArrayList<>(numbers);
            List<Character> ops = new ArrayList<>(operators);
            
            for(char op:order){
                for(int i=0;i<ops.size(); ){
                    if(ops.get(i) == op) {
                        long result = calc(nums.get(i), nums.get(i+1), op);
                        
                        nums.remove(i+1);
                        nums.set(i,result);
                        ops.remove(i);
                    } else{
                        i++;
                    }
                }
            }
            long absResult = Math.abs(nums.get(0));
            answer = Math.max(answer, absResult);
        }
        return answer;
    }
    private long calc(long a, long b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
        }
        return 0;
    }
}