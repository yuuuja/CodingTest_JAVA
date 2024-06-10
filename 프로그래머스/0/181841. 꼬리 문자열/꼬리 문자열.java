import java.util.ArrayList;
class Solution {
    public String solution(String[] str_list, String ex) {
        ArrayList<String> result = new ArrayList<>();
        for( String str : str_list){
            result.add(str);
        }
        for(int i=result.size()-1;i>=0;i--){ 
            //제거할 때 리스트 크기가 변동되므로 뒤에서 부터 순회
            if(result.get(i).contains(ex)){
                result.remove(i);
            }
        }
        String answer = String.join("",result);
        return answer;
    }
}