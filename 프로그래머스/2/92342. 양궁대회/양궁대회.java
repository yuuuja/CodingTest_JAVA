import java.util.*;
class Solution {
    int maxDiff = 0;
    int[] answer = {-1};
    public int[] solution(int n, int[] info) {
        // 백트래킹 (DFS)
        // 10점부터 0점까지 각 점수별로화살을 쏠지 말지 재귀적으로 결정  
        dfs(0,n,info, new int[11]);
        return answer;
    }
    private void dfs(int idx, int arrowsLeft, int[] info, int[] ryan){
        if(idx==11 || arrowsLeft == 0){
            if(arrowsLeft > 0){
                ryan[10] += arrowsLeft;
            }
            
            int[] score = calcScore(info, ryan); //{라이언점수, 어피치점수}
            int diff = score[0] - score[1];
            if(diff > 0){
                if(diff>maxDiff){
                    maxDiff = diff;
                    answer = ryan.clone();
                } else if(diff == maxDiff){
                    // 더 낮은 점수를 많이 맞힌 경우를 저장
                    for(int i=10;i>=0;i--){
                        if(ryan[i] > answer[i]) {
                            answer = ryan.clone();
                            break;
                        } else if(ryan[i] < answer[i]){
                            break;
                        }
                    }
                }
            }
            if(arrowsLeft > 0){
                ryan[10] -= arrowsLeft; //원복
            }
            return;
        }
        
        //idx 점수를 가져오기위해 어피치보다 1발 더 쏘기
        if(arrowsLeft > info[idx]){
            ryan[idx] = info[idx]+1;
            dfs(idx+1, arrowsLeft - ryan[idx], info, ryan);
            ryan[idx] = 0; //원복
        }
        
        //idx 점수를 포기하기
        dfs(idx+1, arrowsLeft, info, ryan);
    }
    private int[] calcScore(int[] info, int[] ryan) {
        int apeachScore = 0, ryanScore = 0;
        for(int i=0;i<=10;i++){
            if(info[i] == 0 && ryan[i]==0) continue;
            if(ryan[i] > info[i]){
                ryanScore += 10-i;
            } else {
                apeachScore += 10-i;
            }
        }
        return new int[]{ryanScore, apeachScore};
    }
}