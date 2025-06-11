import java.util.*;
class Solution {
    List<Set<Integer>> candidateKeys = new ArrayList<>();
    
    public int solution(String[][] relation) {
        // 컬럼들의 모든 조합이 필요 -> 완전 탐색
        // 각 조합이 유일성과 최소성을 만족하는지 판단 -> 백트랙킹
        
        int colSize = relation[0].length;
        
        // 부분조합 백트래킹으로 생성(1개~colSize 개)
        for(int size = 1;size<=colSize;size++){
            backtrack(0,size,new HashSet<>(), colSize, relation);
        }
        return candidateKeys.size();
    }
    // 조합을 생성하는 백트래킹 메서드
    private void backtrack(int start, int targetSize, Set<Integer> currentSet, int colSize, String[][] relation){
        if(currentSet.size() == targetSize){
            // 최소성 확인
            for(Set<Integer> key : candidateKeys) {
                if(currentSet.containsAll(key)){ //이미 등록된 후보키가 currentSet의 부분집합이면 의미 없음
                    return;
                }
            }
            // 유일성 확인
            if(isUnique(currentSet, relation)){
                candidateKeys.add(new HashSet<>(currentSet));
            }
            return;
        }
        
        for(int i=start;i<colSize;i++){
            currentSet.add(i);
            backtrack(i+1, targetSize, currentSet, colSize, relation);
            currentSet.remove(i);
        }
    }
    private boolean isUnique(Set<Integer> keySet, String[][] relation){
        Set<String> seen = new HashSet<>();
        
        for(String[] row : relation){
            StringBuilder sb = new StringBuilder();
            for(int idx : keySet){
                sb.append(row[idx]).append(",");
            }
            seen.add(sb.toString());
        }
        return seen.size() == relation.length;
    }
}