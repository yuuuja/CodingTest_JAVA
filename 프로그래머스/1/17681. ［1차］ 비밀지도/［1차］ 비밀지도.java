class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0;i<n;i++){
            String binary=Integer.toBinaryString(arr1[i] | arr2[i]);
            binary = String.format("%" + n + "s", binary).replace(' ', '0'); //왼쪽에 채워지는 공백을 '0'으로 대체
            StringBuilder sb = new StringBuilder();
            for(char c:binary.toCharArray()){
                sb.append((c=='1') ? "#":" ");
            }
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}