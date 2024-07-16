class Solution {
    public boolean solution(String s) {
        char[] chr = s.toCharArray();
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6){
           for(int i=0;i<chr.length;i++){
              if(chr[i]>=65 && chr[i]<=122){
                  return false;
              }
           }
        } else {
            answer = false;
        }
        
        
        return answer;
    }
}