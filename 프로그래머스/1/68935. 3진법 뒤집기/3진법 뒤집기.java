class Solution {
    public int solution(int n) {
        int answer = 0;
        String trit = "";
        while(n != 0){
            trit += String.valueOf(n%3);
            n/=3;
            if(n==1){
                trit+="1";
                break;
            }
        }

        for(int i=0;i<trit.length();i++){
            answer +=  (int)Math.pow(3,i) * Integer.valueOf(trit.charAt(trit.length()-1-i)-'0');
        }

        return answer;
    }
}