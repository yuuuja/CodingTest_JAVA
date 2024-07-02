class Solution {
    public double solution(int[] arr) {
        double sum = 0;
        for(int s : arr){
           sum += s; 
        }
        return sum/arr.length;
    }
}