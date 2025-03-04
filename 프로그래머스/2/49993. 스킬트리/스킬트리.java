import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(String skills : skill_trees){
            String result = skills.replaceAll("[^"+skill+"]","");
            if(skill.startsWith(result)){
                answer++;
            }
        }
        
        return answer;
    }
}