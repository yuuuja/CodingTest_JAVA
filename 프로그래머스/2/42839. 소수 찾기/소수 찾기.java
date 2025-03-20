import java.util.*;
class Solution {
    public int solution(String numbers) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        
        permutation("",numbers,set);
        
        for(int num: set){
            if(isPrime(num)){
                answer++;
            }
        }
        return answer;
    }
    // 순열 
    private void permutation(String str, String numbers, Set<Integer> set){
        if(!str.isEmpty()){
            set.add(Integer.parseInt(str));
        }
        for(int i=0;i<numbers.length();i++){
            // 한문자씩 str에 추가하고, 남은 문자열로 재귀 호출
            permutation(str+numbers.charAt(i), numbers.substring(0,i)+numbers.substring(i+1), set); 
        }
    }
    
    private boolean isPrime(int num){
        if(num <= 1) return false;
        if(num == 2 || num == 3) return true;
        if(num % 2==0 ||num %3==0) return false;
        for(int i=5;i*i<=num;i+=6){
            if(num % i==0 || num % (i+2) ==0) return false;
        }
        return true;
    }
}