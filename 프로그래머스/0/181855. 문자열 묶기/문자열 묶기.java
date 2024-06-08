class Solution {
    public int solution(String[] strArr) {
        int max = 0;
        int[] length = new int[31];
        for(String str : strArr){
            length[str.length()]++;
        }
        
        for (int count : length) {
            max = Math.max(max, count);
        }
        return max;
    }
}