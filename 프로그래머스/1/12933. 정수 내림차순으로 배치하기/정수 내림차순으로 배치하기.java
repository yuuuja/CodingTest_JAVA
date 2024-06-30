import java.util.Arrays;
class Solution {
    public long solution(long n) {
        
        char[] c = String.valueOf(n).toCharArray();
        Arrays.sort(c);
        String str = "";
        for(int i=c.length-1;i>=0;i--){
            str+=c[i];
        }
        return Long.valueOf(str);
    }
}