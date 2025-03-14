import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        Map<String, String> id_map = new HashMap<>();
        for(String r: record){
            String[] parts = r.split(" ");
            String action = parts[0];
            String ID = parts[1];

            if (action.equals("Enter") || action.equals("Change")) {
                id_map.put(ID, parts[2]);
            }
        }
        List<String> result = new ArrayList<>();
        for(String r: record){
            String[] parts = r.split(" ");
            String ID = parts[1];
            String str = parts[0];
            if(str.equals("Enter")){
                result.add(id_map.get(ID)+"님이 들어왔습니다.");
            } else if(str.equals("Leave")) {
                result.add(id_map.get(ID)+"님이 나갔습니다.");
            }
        }
        String[] answer = new String[result.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=result.get(i);
        }
        
        return answer;
    }
}