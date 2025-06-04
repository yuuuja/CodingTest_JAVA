class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        //이분탐색 -> 숙련도 기준
        int left = 1;
        int right = 100000;
        int answer = right;
        
        while(left<=right){
            int mid = (left+right) /2;
            long usedTime = getTime(mid,diffs,times);
            
            if(usedTime <= limit){
                answer = mid;
                right = mid -1; //현재 숙련도로 가능 -> 더 낮은 숙련도도 시도
            } else{
                left = mid + 1;
            }
        }
        
        return answer;
    }
    public long getTime(int level, int[]diffs, int[]times){
        long total = 0;
        for(int i=0;i<diffs.length;i++){
            if(i==0 || diffs[i] <= level) {
                total += times[i];
            } else{
                int fail = diffs[i]-level; //틀린횟수
                total += (long) fail * (times[i]+times[i-1]) + times[i];
            }
        }
        return total;
    }
}