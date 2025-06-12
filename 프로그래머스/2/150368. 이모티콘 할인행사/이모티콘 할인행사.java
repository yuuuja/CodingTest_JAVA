import java.util.*;
class Solution {
    static int[] discount = {10, 20, 30, 40};
    static int[] selected; // 선택된 할인율 저장용
    static int maxSubscribers = 0; // 최대 가입자 수
    static int maxSales = 0;//최대 매출
    static int[][] usersGlobal;
    static int[] emoticonsGlobal;
    
    public int[] solution(int[][] users, int[] emoticons) {
         
        usersGlobal = users;
        emoticonsGlobal = emoticons;
        
        // n개의 이모티콘마다 할인율 하나씩 선택하는 모든 경우의 수
        selected = new int[emoticons.length];
        dfs(0);
        
        
        return new int[]{maxSubscribers, maxSales};
    }
    
    // 중복 순열(DFS)
    private void dfs(int depth){
        if(depth == emoticonsGlobal.length){
            simulate(); // 할인률 조합 완성
            return;
        }
        
        for(int rate: discount){
            selected[depth] = rate;
            dfs(depth+1); //다음 이모티콘
        }
    }
    
    // 현재 selected[] 조합에 대해 사용자별 구매 여부 계산
    private void simulate(){
        int subscribers = 0;
        int sales = 0;
        
        for(int[] user:usersGlobal){
            int minDiscount = user[0];
            int limit = user[1];
            
            int total = 0;
            
            for(int i=0;i<emoticonsGlobal.length;i++){
                int rate = selected[i];
                
                if(rate >= minDiscount){
                    total += emoticonsGlobal[i] * (100-rate) / 100;
                }
            }
            
            if(total >= limit){
                subscribers++;
            } else{
                sales += total;
            }
        }
        
        if(subscribers > maxSubscribers){
            maxSubscribers = subscribers;
            maxSales = sales;
        } else if(subscribers == maxSubscribers){
            maxSales = Math.max(maxSales, sales);
        }
    }
}