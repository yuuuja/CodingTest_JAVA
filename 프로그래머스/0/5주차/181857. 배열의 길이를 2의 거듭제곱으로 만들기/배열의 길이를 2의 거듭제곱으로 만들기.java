import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int num : arr){
            list.add(num);
        }
        
        for(int i=0;i<=10;i++){
            if(list.size()<(int)Math.pow(2,i)&&list.size()>(int)Math.pow(2,i-1)){
                while(list.size()<(int)Math.pow(2,i)){
                    list.add(0);
                }
                break;
            }
            else if(list.size()==(int)Math.pow(2,i)){
                break;
            }
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
    
}
