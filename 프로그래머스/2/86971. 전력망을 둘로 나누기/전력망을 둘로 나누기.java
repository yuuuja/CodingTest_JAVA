import java.util.*;
class Solution {
    public int solution(int n, int[][] wires) {
        //트리를 인접 리스트로 구성
        List<Integer>[] graph = new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            graph[i]=new ArrayList<>();
        }
        
        //모든 간선 연결
        for(int[] wire : wires){
            int a = wire[0];
            int b = wire[1];
            graph[a].add(b);
            graph[b].add(a);
        }
        int minDiff = Integer.MAX_VALUE;
        
        //각 간선을 하나씩 끊는다
        for(int[] wire : wires){
            int a = wire[0];
            int b = wire[1];
            
            graph[a].remove((Integer)b);
            graph[b].remove((Integer)a);
            
            //DFS로 한 쪽 서브트리 노드 개수 세기
            boolean[] visited = new boolean[n+1];
            int count = dfs(a, graph, visited);
            
            int diff = Math.abs(n-count - count);
            minDiff = Math.min(minDiff, diff);
            
            graph[a].add(b); //복구
            graph[b].add(a);
        }
        
        return minDiff;
    }
    private int dfs(int node, List<Integer>[] graph, boolean[] visited){
        visited[node] = true;
        int count = 1;
        
        for(int next : graph[node]){
            if(!visited[next]){
                count += dfs(next, graph, visited);
            }
        }
        return count;
    }
}