class Solution {
    private int count = 0;
    public int solution(int[] numbers, int target) {
        // 모든 숫자를 각각 + 또는 - 로 처리하면서 경우의 수 구하기
        dfs(numbers, target, 0, 0);
        return count;
    }
    private void dfs(int[] numbers, int target, int depth, int sum){
        if(depth == numbers.length){ // 숫자 다 사용
            if(sum == target){
                count++;
            }
            return;
        }
        dfs(numbers, target, depth+1,sum+numbers[depth]); // + 연산
        dfs(numbers, target, depth+1,sum-numbers[depth]); // - 연산
    }
    
}