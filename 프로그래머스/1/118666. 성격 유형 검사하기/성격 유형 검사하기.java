import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        Map<String, Integer> score = new HashMap<>();
        for(int i=0;i<choices.length;i++){
            String first = String.valueOf(survey[i].charAt(0));
            String second = String.valueOf(survey[i].charAt(1));
            
            if(choices[i] < 4){
                score.put(first, score.getOrDefault(first, 0) + (4 - choices[i]));
            } else if(choices[i] > 4){
                score.put(second, score.getOrDefault(second, 0) + (choices[i])-4);
            } else{
                continue;
            }
        }
        answer.append(score.getOrDefault("R",0)>=score.getOrDefault("T",0)?"R":"T");
        answer.append(score.getOrDefault("C",0)>=score.getOrDefault("F",0)?"C":"F");
        answer.append(score.getOrDefault("J",0)>=score.getOrDefault("M",0)?"J":"M");   
        answer.append(score.getOrDefault("A",0)>=score.getOrDefault("N",0)?"A":"N");
        
        
        return answer.toString();
    }
}