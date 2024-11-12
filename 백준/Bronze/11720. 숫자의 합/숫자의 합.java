import java.io.*;
public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;
        for(int i=0;i<N;i++){
            sum+=s.charAt(i)-'0';
        }
        System.out.print(sum);
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}