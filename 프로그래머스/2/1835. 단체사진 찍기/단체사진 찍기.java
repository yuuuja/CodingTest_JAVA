import java.util.*;
class Solution {
    private static String[] fr = {"A", "C", "F", "J", "M", "N", "R", "T"}; //카카오 친구들
	private static int cnt = 0; // 경우의 수
    public int solution(int n, String[] data) {
        boolean[] visited = new boolean[8];
        StringBuilder sb = new StringBuilder();
        cnt = 0;
        dfs(sb, visited, data, 0);
        
        return cnt;
    }
    public static void dfs(StringBuilder sb, boolean[] visited, String[] data, int depth){
        if(depth==8){
            if(check(sb, data)){
                cnt++;
            }
            return;
        }
        
        for(int i=0;i<fr.length;i++){
            if(visited[i]) continue;
            
            visited[i] = true;
            sb.append(fr[i]);
            dfs(sb, visited, data, depth+1);
            visited[i] = false;
            sb.delete(depth, sb.length());
        }
    }
    public static boolean check(StringBuilder sb, String[] data){
        String st = sb.toString();
        
        for(String datas: data){
            int me = st.indexOf(datas.charAt(0)); //내 위치
            int you = st.indexOf(datas.charAt(2)); //상대방 위치
            char condition = datas.charAt(3); //=,>,< 중 하나
            int num = datas.charAt(4)-'0';
            
            if(condition == '='){
                if(!(Math.abs(me-you)-1 == num)) return false;
            }else if(condition == '>'){
                if(!(Math.abs(me-you)-1 > num)) return false;
            }else if(condition == '<'){
                if(!(Math.abs(me-you)-1 < num)) return false;
            }
        }
        return true;
    }
}