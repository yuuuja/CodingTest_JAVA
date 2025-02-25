import java.util.*;
class Solution {
    public int[] solution(String msg) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> dict = new HashMap<>();
        for(int i=0;i<26;i++){ // 사전 초기화
            char alpha = (char)('A'+i);
            dict.put(String.valueOf(alpha).toUpperCase(),i+1);
        }
        int dictIndex = 27;
        int i=0;
        while(i<msg.length()){
            String word = ""+msg.charAt(i);
            int j=i+1;
            
            while(j<msg.length() && dict.containsKey(word+msg.charAt(j))){
                word+=msg.charAt(j);
                j++;
            }
            
            list.add(dict.get(word));
            if(j < msg.length()){
                dict.put(word+msg.charAt(j), dictIndex++);
            }
            
            i=j;
        }
        
        return list.stream().mapToInt(x->x).toArray();
    }
}