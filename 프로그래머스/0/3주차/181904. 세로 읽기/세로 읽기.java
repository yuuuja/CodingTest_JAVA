class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char[] arr= my_string.toCharArray();
        for(int i=0;c+m*i<=arr.length;i++){
            answer+=arr[c-1+m*i];
        }
        return answer;
    }
}
