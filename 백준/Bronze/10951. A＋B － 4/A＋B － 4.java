import java.util.StringTokenizer;
import java.io.*;

public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input;
        
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write((a+b)+"\n");
        }
        bw.flush();
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}