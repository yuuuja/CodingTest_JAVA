class Solution {
    public boolean solution(int x) {
        
        int sum=0;
        char[] chr = String.valueOf(x).toCharArray();
        for(char c : chr){
            sum+=Character.getNumericValue(c);
        }
        boolean answer = x%sum==0;
        return answer;
    }
}