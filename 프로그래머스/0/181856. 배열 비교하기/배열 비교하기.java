import java.util.Arrays;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        if(arr1.length != arr2.length){
            answer = arr1.length>arr2.length?1:-1;
            return answer;
        } else{
            sum1=Arrays.stream(arr1).sum();
            sum2=Arrays.stream(arr2).sum();
            if(sum1!=sum2){
                answer = sum1>sum2?1:-1;
                return answer;
            }
            else{
                return answer;
            }
        }
        
        
    }
}