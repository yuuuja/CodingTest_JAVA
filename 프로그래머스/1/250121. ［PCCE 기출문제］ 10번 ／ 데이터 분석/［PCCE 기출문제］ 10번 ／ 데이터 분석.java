import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<List<Integer>> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        map.put("code",0);
        map.put("date",1);
        map.put("maximum",2);
        map.put("remain",3);
        
        for(int i=0;i<data.length;i++){
            if(data[i][map.get(ext)] <= val_ext){
                List<Integer> row = new ArrayList<>();
                for(int j=0;j<data[i].length;j++){
                    row.add(data[i][j]);
                }
                list.add(row);
            }
        }
        // sort_by 값을 기준으로 정렬
        list.sort(Comparator.comparingInt(row ->row.get(map.get(sort_by))));
        
        //2차원 배열로 변환
        int[][] answer = new int[list.size()][data[0].length];
        for(int i=0;i<list.size();i++){
            for(int j = 0;j<list.get(i).size();j++){
                answer[i][j] = list.get(i).get(j);
            }
        }
        return answer;
    }
}