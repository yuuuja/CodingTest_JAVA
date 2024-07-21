class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for(int i=1;i<food.length;i++){
            int count = food[i]/2;
            for(int j=0;j<count;j++){
                answer.append(i);
            }
        }
        StringBuilder rev_answer = new StringBuilder(answer).reverse();
        
        return answer.toString() + "0" +rev_answer.toString();
    }
}