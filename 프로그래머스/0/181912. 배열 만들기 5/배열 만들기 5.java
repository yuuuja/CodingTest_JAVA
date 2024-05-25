import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        //int[] answer = {};
        for(int i=0;i<intStrs.length;i++){
            String str=intStrs[i].substring(s,s+l);
            if(Integer.valueOf(str)>k){
                ret.add(Integer.valueOf(str));
            }
        }
        int[] answer = new int[ret.size()];
        for(int i=0;i<ret.size();i++){
            answer[i]=ret.get(i);
        }
        return answer;
    }
}