class Solution {
    public int[] solution(int[][] edges) {
        int MAX = 1000000;
        int[] input = new int[MAX+1];
        int[] output = new int[MAX+1];
        
        int maxNode =0;
        for(int[] e : edges){
            input[e[1]]++;
            output[e[0]]++;
            
            maxNode = Math.max(maxNode, Math.max(e[0], e[1]));
        }
        int[] answer = new int[4];
        
        for(int i=1;i<=maxNode;i++){
            if(input[i]==0 && output[i]>=2){ //정점
                answer[0] = i;
            } else if(input[i]>0 && output[i] == 0) { //막대 모양
                answer[2]++;
            } else if(input[i] >=2 && output[i] >=2){
                answer[3]++;
            }
        }
        //도넛모양 : 생성된 정점으로부터 진출한 간선 수 - (막대모양 그래프 수 + 8자모양 그래프 수)
        answer[1] = output[answer[0]] - (answer[2]+answer[3]);
        return answer;
    }
}