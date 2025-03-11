import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        if(x==y){
            return 0;
        }
        
        Queue<int[]> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        queue.add(new int[]{x,0}); // 현재값, 연산 횟수
        visited.add(x);
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int num = current[0];
            int depth = current[1];
            
            int[] nextNum = {num+n, num*2, num*3};
            
            for(int next : nextNum){
                if(next == y){
                    return depth +1;
                }
                if(next < y && !visited.contains(next)){
                    visited.add(next);
                    queue.add(new int[]{next, depth+1});
                }
            }
        }
        return -1;
    }

}