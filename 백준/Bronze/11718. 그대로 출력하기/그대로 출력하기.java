import java.io.*;
public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        while((s=br.readLine())!=null){
            bw.write(s+"\n");
        }
        bw.flush();
        bw.close();
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}