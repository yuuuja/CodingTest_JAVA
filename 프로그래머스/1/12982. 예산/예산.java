import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int money : d){
            if(budget>=money){
                budget-=money;
                answer++;
            } else{
                break; //예산부족
            }
        }
        
        return answer;
    }
}