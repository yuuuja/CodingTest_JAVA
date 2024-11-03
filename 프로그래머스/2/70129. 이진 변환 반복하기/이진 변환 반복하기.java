class Solution {
    public int[] solution(String s) {
        int remove_count = 0;
        int change_count = 0;
        while(!s.equals("1")){
            remove_count += s.length()-s.replaceAll("0","").length();
            s=s.replaceAll("0","");
            s = Integer.toBinaryString(s.length());
            change_count++;
}
        
        
        
        int[] answer = {change_count,remove_count};
        
        return answer;
    }
}