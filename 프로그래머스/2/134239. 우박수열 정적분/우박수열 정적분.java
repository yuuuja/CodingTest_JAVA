import java.util.*;
class Solution {
    public double[] solution(int k, int[][] ranges) {
        // range의 [0]과 [1]의 값은 시작과 끝 까지 부터 떨어진 값
        //콜라츠 추측
        List<Integer> list = new ArrayList<>();
        list.add(k);
        while(k>1){
            if (k % 2 == 0) k /= 2;
            else k = k * 3 + 1;
            list.add(k); 
        }
        int cnt = list.size();
        
        //사다리꼴 넓이
        double[] area = new double[cnt];
        for(int i=1;i<cnt;i++){
            area[i] = ((double)list.get(i-1)+list.get(i))/2.0;
        }
        
        //넓이 누적합
        double[] prefixSum = new double[cnt];
        for (int i = 1; i < cnt; i++) {
            prefixSum[i] = prefixSum[i - 1] + area[i];
        }
        
        double[] answer = new double[ranges.length];
        for(int i=0;i<ranges.length;i++){
            int start = ranges[i][0];
            int end = cnt-1 + ranges[i][1];
            
            if(end>start){
                double val = prefixSum[end]-prefixSum[start];
                answer[i]=Double.parseDouble(String.format("%.1f",val));
            } else if(start>end){
                answer[i]=-1.0;
            } else{
                answer[i] = 0.0;
            }
        }
        return answer;
    }
}