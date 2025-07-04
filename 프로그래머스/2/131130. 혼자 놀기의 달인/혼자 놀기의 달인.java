import java.util.*;
class Solution {
    public int solution(int[] cards) {
        int N = cards.length;
        boolean[] visited = new boolean[N];
        List<Integer> groupSizes = new ArrayList<>();
        
        for(int i=0;i<N;i++){
            if(!visited[i]){
                int count = 0;
                int current = i;
                while(!visited[current]){
                    visited[current] = true;
                    current = cards[current] -1;
                    count++;
                }
                groupSizes.add(count);
            }
        }
        
        if(groupSizes.size() < 2)
            return 0;
        
        Collections.sort(groupSizes, Collections.reverseOrder());
        return groupSizes.get(0) * groupSizes.get(1);
    }
}