import java.util.*;

class Solution {
    public int solution(int n, int[][] q, int[] ans) {
        List<Integer> candidates = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            candidates.add(i);
        }
        return dfs(0, 0, new ArrayList<>(), candidates, q, ans, q[0].length);
    }

    private int dfs(int depth, int start, List<Integer> current, List<Integer> candidates, int[][] q, int[] ans, int codeSize) {
        if (depth == codeSize) {
            Set<Integer> selected = new HashSet<>(current);
            for (int i = 0; i < q.length; i++) {
                int count = 0;
                for (int num : q[i]) {
                    if (selected.contains(num)) {
                        count++;
                    }
                }
                if (count != ans[i]) {
                    return 0;
                }
            }
            return 1;
        }

        int total = 0;
        for (int i = start; i < candidates.size(); i++) {
            current.add(candidates.get(i));
            total += dfs(depth + 1, i + 1, current, candidates, q, ans, codeSize);
            current.remove(current.size() - 1);
        }
        return total;
    }
}
