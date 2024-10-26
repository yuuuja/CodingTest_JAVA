import java.io.*;

public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i=1;i<=num;i++){
            bw.write(String.format("%"+num+"s","*".repeat(i))+"\n");
        }
        bw.flush();
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}