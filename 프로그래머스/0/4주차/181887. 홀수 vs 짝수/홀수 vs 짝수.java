class Solution {
    public int solution(int[] num_list) {
        int even = 0; //짝수
        int odd = 0; //홀수
        
        for(int i=0;i<num_list.length;i+=2){
            odd+=num_list[i];
        }
        for(int i=1;i<num_list.length;i+=2){
            even+=num_list[i];
        }
        
        return odd==even?odd:Math.max(odd,even);
    }
}
