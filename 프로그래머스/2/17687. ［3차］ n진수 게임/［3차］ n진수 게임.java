import java.util.*;
class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder numbers = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        
        int num = 0;
        while(numbers.length() < t*m){
            numbers.append(Integer.toString(num++,n).toUpperCase());
        }
        
        for(int i=0;i<t;i++){
            answer.append(numbers.charAt(i*m+(p-1)));
        }
        
        return answer.toString();
    }
}