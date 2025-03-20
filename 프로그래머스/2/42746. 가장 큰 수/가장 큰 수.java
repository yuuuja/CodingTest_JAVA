import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        // int 배열 -> string 배열
        String[] strNums = new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            strNums[i]=String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b)); // 내림차순 정렬
        
        //  모든 값이 "0"인지 확인
        if (strNums[0].equals("0")) return "0"; // "0000" -> "0" 처리

        //  결과 조합
        return String.join("", strNums);
    }
}