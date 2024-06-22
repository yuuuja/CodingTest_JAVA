import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String pname : participant){ //참가자 해시맵에 이름과 등장횟수로 추가
            map.put(pname,map.getOrDefault(pname, 0) + 1);
        }
        for(String cname : completion){ //완주자 해시맵에서 등장횟수 감소
            if(map.containsKey(cname)){
                map.put(cname,map.get(cname) - 1);
            }
            
        }
        for(String key : map.keySet()){
            if(map.get(key)>0){
                return key;
            }
        }
        return null;
        
    }
}