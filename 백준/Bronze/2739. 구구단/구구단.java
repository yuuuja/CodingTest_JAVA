import java.io.*;
public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for(int i=1;i<=9;i++){
            bw.write(num+" * "+i+" = "+num*i+"\n");
        }
        bw.flush();
        bw.close();
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}