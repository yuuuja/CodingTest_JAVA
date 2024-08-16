class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int idx = -1;
        char[] c = dartResult.toCharArray();
        
        for(int i=0;i<c.length;i++){
            if(c[i] >= '0' && c[i]<= '9'){
                idx++;
                if(c[i]=='1'&&c[i+1]=='0'){ //10인 경우
                    score[idx]=10;
                    i++; //'0' 건너뛰기
                } else {
                    score[idx] = c[i] - '0';
                }             
            }
            
            switch(c[i]){
                case 'S':
                    break;
                case 'D':
                    score[idx] = (int)Math.pow(score[idx],2);
                    break;
                case 'T':
                    score[idx] = (int)Math.pow(score[idx],3);
                    break;
                case '*':
                    score[idx] *= 2;
                    if(idx-1>=0){
                        score[idx-1] *= 2;
                    }
                    break;
                case '#':
                    score[idx] *= -1;
                    break;
            }
        }
        return score[0]+score[1]+score[2];
    }
}