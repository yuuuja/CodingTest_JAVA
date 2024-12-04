import java.io.*;
public class Main{
    public int solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-1-i)){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) throws Exception{
        int result = new Main().solution();
        System.out.print(result);
    }
}