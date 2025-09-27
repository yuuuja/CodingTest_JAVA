import java.util.*;
class Solution {
    private boolean[] visited;
    private int answer = 0;
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        DFS(begin, target, words, 0);
        
        return answer;
    }
    
    public void DFS(String cur, String target, String[] words, int cnt){
        if(cur.equals(target)){
            answer = cnt;
            return;
        }
        
        for(int i=0;i<words.length;i++){
            if(visited[i]) continue;
            
            if(canConvert(cur, words[i])){
                visited[i] = true;
                DFS(words[i], target, words, cnt+1);
                visited[i] = false;
            }
        }
    }
    
    // 변환 가능여부 반환
    public boolean canConvert(String from, String to){
        int cnt = 0;
        for(int i=0;i<from.length();i++){
            if(from.charAt(i) == to.charAt(i)) cnt++;
        }
        
        return from.length() == cnt+1? true:false;
    }
}