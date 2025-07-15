import java.util.*;
class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        // 최소 이동 거리를 구하기 위해 배열 뒤에서부터 순회
        // 스택에 저장
        
        long answer = 0;
        Stack<Integer> dStack = new Stack<>();
        Stack<Integer> pStack = new Stack<>();
        
        for(int i=0;i<n;i++){
            if(deliveries[i] != 0){
                dStack.push(i);
            }
            if(pickups[i] != 0){
                pStack.push(i);
            }
        }
        
        int dLen = 0, pLen = 0;
        int dCap = cap, pCap = cap;
        
        while(!dStack.isEmpty() || !pStack.isEmpty()){
            dLen = !dStack.isEmpty() ? dStack.peek() +1 : dLen;
            
            while(!dStack.isEmpty()){
                int delivery = dStack.pop();
                
                if(dCap - deliveries[delivery] > 0){
                    dCap -= deliveries[delivery];
                    continue;
                }
                
                if(dCap - deliveries[delivery] == 0){
                    dCap = 0;
                    break;
                }
                
                deliveries[delivery] -= dCap;
                dStack.push(delivery);
                dCap = 0;
                break;
            }
            
            pLen = !pStack.isEmpty() ? pStack.peek() +1:pLen;
            
            while(!pStack.isEmpty()) {
                int pickup = pStack.pop();
                
                if(pCap - pickups[pickup] > 0){
                    pCap -= pickups[pickup];
                    continue;
                }
                
                if(pCap - pickups[pickup] == 0){
                    pCap = 0;
                    break;
                }
                
                pickups[pickup] -= pCap;
                pStack.push(pickup);
                pCap = 0;
                break;
            }
            
            answer += Math.max(pLen, dLen) * 2;
            pLen = 0;
            dLen = 0;
            dCap = cap;
            pCap = cap;
        }
        return answer;
    }
}