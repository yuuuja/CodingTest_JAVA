import java.util.*;
class Solution {
    public int[] solution(int n, long k) {
        List<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=n;i++){
            numbers.add(i);
        }
        
        int[] answer = new int[n];
        long factorial = 1;
        
        for(int i=2; i<=n;i++){
            factorial *= i;
        }
        
        k--;
        
        for(int i=0;i<n;i++){
            factorial /= (n-i); //(n-1)!
            int index = (int)(k/factorial);
            answer[i]=numbers.get(index);
            numbers.remove(index);
            k %= factorial;
        }
        return answer;
    }

}