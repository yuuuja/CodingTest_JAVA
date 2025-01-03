import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;
        
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<cities.length;i++){
            String city = cities[i].toLowerCase();
            if(map.containsKey(city)){ //캐시 히트
                map.put(city,i);
                answer++;
            } else{
                answer+=5; //캐시 미스
                if(map.size() == cacheSize) {
                    String leastUsed = Collections.min(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
                    map.remove(leastUsed);               
                } 
                map.put(city,i);
            }
            
        }
        return answer;
    }
}