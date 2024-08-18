import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int zero_cnt = 0;
        int win_cnt = 0;
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        for(int i=0;i<lottos.length;i++){
            if(lottos[i]==0){
                zero_cnt++;
            }
            for(int j=0;j<win_nums.length;j++){
                if(win_nums[j]==lottos[i]){
                    win_cnt++;
                }
            }
        }
        int max_rank=zero_cnt+win_cnt;
        int min_rank=win_cnt;
        
        return new int[] {rank(max_rank),rank(min_rank)};
    }
    public int rank(int num){
        if(num>=6) return 1;
        else if(num==5) return 2;
        else if(num==4) return 3;
        else if(num==3) return 4;
        else if(num==2) return 5;
        else return 6;
        
    }
}