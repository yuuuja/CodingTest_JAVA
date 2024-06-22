import java.util.*;
class Solution {
    public int solution(String numbers) {
        Set<Integer> set = new HashSet<>();
        int answer = 0;
        permutations("",numbers,set);
        
        for(int num : set){
            if(isPrime(num)){ // 소수라면 1증가
                answer++;
            }
        }
        return answer;
    }
    private void permutations(String prefix, String remaining, Set<Integer> set){
        if(!prefix.isEmpty()){
            set.add(Integer.parseInt(prefix));
        }
        //remaining 문자열을 순회하면서 각 문자를 prefix에 추가하고, 남은 문자열로 재귀 호출
        for(int i=0; i<remaining.length();i++){
            permutations(prefix+remaining.charAt(i),remaining.substring(0,i)+remaining.substring(i+1),set);
        }
    }
    private boolean isPrime(int num){ // 소수 판별
        if(num <= 1) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;
        for(int i=3;i*i <= num;i+=2){ //홀수만 검사, i가 num의 제곱근 이하일 때만 반복
            if(num % i == 0) return false;
        }
        return true;
    }
}