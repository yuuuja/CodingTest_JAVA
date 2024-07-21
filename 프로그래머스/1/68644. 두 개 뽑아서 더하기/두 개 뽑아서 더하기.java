import java.util.HashSet;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                set.add(numbers[i]+numbers[j]);// 중복 자동제거
            }
        }
        int[] answer = set.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}