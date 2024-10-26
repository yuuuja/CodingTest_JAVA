import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for(int i=1;i<=num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sum = a+b;
            bw.write("Case #"+i+": "+sum+"\n");
        }
        bw.flush();
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}