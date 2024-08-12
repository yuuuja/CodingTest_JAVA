class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int roller = section[0];
        for(int i=0;i<section.length;i++){
            if(section[i]>=roller && section[i]<roller+m){
                continue;
            } else{
                roller=section[i];
                answer++;
            }
        }
        return answer;
    }
}