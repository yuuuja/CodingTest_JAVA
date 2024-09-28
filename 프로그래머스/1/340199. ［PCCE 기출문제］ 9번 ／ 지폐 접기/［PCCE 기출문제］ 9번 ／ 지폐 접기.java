import java.util.Arrays;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        Arrays.sort(wallet);
        Arrays.sort(bill);
        
        int b_short = bill[0];
        int b_long = bill[1];
        
        while(!(b_short <= wallet[0] && b_long <= wallet[1])){
            int temp = b_long/2;
            b_long = Math.max(temp, b_short);
            b_short = Math.min(temp, b_short);       
            answer++;
        }
        return answer;
    }
}