import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max = nums.length/2; //선택가능한 포켓몬 수
        
        int answer = max>=set.size()?set.size():max;
        return answer;
    }
}