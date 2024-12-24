import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<want.length;i++){
            map.put(want[i],number[i]);
        }
        
        for(int i=0;i<=discount.length-10;i++){
            Map<String, Integer> currentMap = new HashMap<>(map);
            boolean isValid = true;
        
            for(int j=i; j<i+10; j++){
                if(currentMap.containsKey(discount[j])) {
                    currentMap.put(discount[j], currentMap.get(discount[j])-1);
                    if(currentMap.get(discount[j]) < 0){
                        isValid = false;
                        break;
                    }
                }
            }
            // 모든 값이 0이 되었는지 확인
            if (isValid && currentMap.values().stream().allMatch(count -> count == 0)) {
                answer++;
            }
        }
        return answer;
    }
}