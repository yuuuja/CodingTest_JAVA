import java.util.*;
class Solution {
    static String[] vowels= {"A","E","I","O","U"};
    static List<String> dictionary = new ArrayList<>();
    public int solution(String word) {
        dfs("",0);
        return dictionary.indexOf(word);
    }
    public void dfs(String current, int depth){
        if(depth > 5) return;
        dictionary.add(current);
        
        for(String vowel : vowels){
            dfs(current + vowel, depth + 1);
        }
    }
}