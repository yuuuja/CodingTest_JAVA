import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        int[] sequence = new int[n*2];
        System.arraycopy(elements, 0, sequence, 0, n);
        System.arraycopy(elements, 0, sequence, n, n);
        
        TreeSet<Integer> set = new TreeSet<>();
        for(int length = 1; length <= n ; length++){
            for (int start = 0; start < n; start++) {
                int sum = 0;
                for (int k = 0; k < length; k++) { // 길이만큼의 부분 수열 합 계산
                    sum += sequence[start + k];
                }
                set.add(sum);
            }
        }
        
        return set.size();
    }
}