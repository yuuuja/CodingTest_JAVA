import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        TreeSet<Integer> gyul_size = new TreeSet<>();
        for(int n : tangerine){
            gyul_size.add(n);
        }
        
        Map<Integer,Integer> sizeToIndex = new HashMap<>();
        int index=0;
        for(int i:gyul_size){
            sizeToIndex.put(i,index++);
        }
        
        int[] sorted_cnt = new int[gyul_size.size()];
        for(int size : tangerine){
            sorted_cnt[sizeToIndex.get(size)]++;
        }
        
        
        Arrays.sort(sorted_cnt);
        for(int i=sorted_cnt.length-1;i>=0;i--){ //내림차순
            if(k<=0) break; // k가 0 이하가 되면 종료
            k -= sorted_cnt[i];
            answer++;

        }
        
        
        return answer;
    }
}