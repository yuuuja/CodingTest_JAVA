import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        Set<Integer> reserveset = new HashSet<>();
        Set<Integer> lostset = new HashSet<>();
        for(int r: reserve){
            reserveset.add(r);
        }
        
        for( int l : lost){
            if(reserveset.contains(l)){ // 여벌옷 도난
                reserveset.remove(l);
            } else{
                lostset.add(l);
            }
        }
        
        for(int l:lostset){
            if(reserveset.contains(l-1)){
                reserveset.remove(l-1);
            } else if(reserveset.contains(l+1)){
                reserveset.remove(l+1);
            } else{
                answer--; // 빌리지 못한 경우
            }
        }
        
        return answer;
    }
}