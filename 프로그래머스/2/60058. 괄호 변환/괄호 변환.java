class Solution {
    public String solution(String p) {
        if (p.isEmpty()) return "";
        
        // 문자열을 균형잡힌 u와 나머지 v로 분리
        int index = splitIndex(p);
        String u = p.substring(0,index);
        String v = p.substring(index);
        
        //올바른 괄호인지
        if(isValid(u)){
            return u+solution(v);
        } else{
            StringBuilder sb = new StringBuilder();
            
            sb.append("(");
            sb.append(solution(v));
            sb.append(")");
            
            String trimmed = u.substring(1,u.length()-1);
            for(char c : trimmed.toCharArray()){
                sb.append(c == '(' ? ')' : '(');
            }
            return sb.toString();
        }
    }
    
    private int splitIndex(String s){
        int count = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) =='(') count++;
            else count--;
            
            if(count == 0) return i+1;
        }
        return s.length();
    }
    private boolean isValid(String s){
        int count =0;
        for(char c:s.toCharArray()){
            if(c=='(') count++;
            else {
                count--;
                if(count<0) return false;
            }
        }
        return count == 0;
    }
}