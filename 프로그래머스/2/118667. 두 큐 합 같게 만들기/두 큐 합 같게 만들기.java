import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Long> q1 = new LinkedList<>();
        Queue<Long> q2 = new LinkedList<>();
        long sum1 = 0;
        for(int num : queue1){
            q1.offer((long)num);
            sum1+=(long)num;
        }
        long sum2 = 0;
        for(int num : queue2){
            q2.offer((long)num);
            sum2+=(long)num;
        }
        
        int limit = queue1.length * 3; //최대 이동 횟수 제한
        int count = 0;
        
        while(count <= limit){
            if(sum1 == sum2){
                return count;
            }
            
            if(sum1 > sum2){
                long num = q1.poll();
                sum1-= num;
                sum2+= num;
                q2.offer(num);
            } else{
                long num = q2.poll();
                sum2-= num;
                sum1+= num;
                q1.offer(num);
            }
            count++;
        }

        return -1;
    }
}