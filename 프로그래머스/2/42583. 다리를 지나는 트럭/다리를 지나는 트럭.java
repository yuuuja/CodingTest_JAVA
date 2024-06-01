import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        //초기화
        for(int i=0;i<bridge_length;i++){
            bridge.offer(0);
        }
        int index =0;
        int on_bridge = 0; // 현재 다리에 있는 모든 트럭의 무게
        int answer = 0;
        
        while(index < truck_weights.length){
            on_bridge -= bridge.poll(); // 현재 다리에 존재하는 맨 앞 트럭의 무게 빼기
            answer++;
            
            if(on_bridge + truck_weights[index] <= weight){
                bridge.offer(truck_weights[index]);
                on_bridge+=truck_weights[index++];
            } else{
                bridge.offer(0); //견딜 수 있는 무게보다 커지면 0을 넣음
            }
        }
        return answer+bridge_length; //마지막 트럭까지 건너는 값까지
    }
}