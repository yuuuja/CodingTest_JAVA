import java.util.*;
class Solution {
    static int[] dist;
    static List<Node>[] graph;
    
    public int solution(int N, int[][] road, int K) {
        //양방향, K시간 이하, 1번 마을에서 출발
        graph = new ArrayList[N+1];
        dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);// 초기 비용
        
        for(int i = 1; i<=N;i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int[] r : road){
            int a = r[0], b=r[1], c=r[2];
            graph[a].add(new Node(b, c));
            graph[b].add(new Node(a, c));
        }
        
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.cost));
        pq.offer(new Node(1, 0));
        dist[1] = 0;

        while (!pq.isEmpty()) {
            Node curr = pq.poll();

            if (curr.cost > dist[curr.to]) continue;

            for (Node next : graph[curr.to]) {
                int newCost = curr.cost + next.cost;
                if (newCost < dist[next.to]) {
                    dist[next.to] = newCost;
                    pq.offer(new Node(next.to, newCost));
                }
            }
        }

        int answer = 0;
        for (int i = 1; i <= N; i++) {
            if (dist[i] <= K) answer++;
        }

        return answer;
    }
    
    static class Node {
        int to, cost;
        Node(int t, int c) {
            to = t;
            cost = c;
        }
    }
}