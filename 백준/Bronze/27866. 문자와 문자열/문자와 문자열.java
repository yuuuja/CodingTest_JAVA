import java.io.*;
public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int i = Integer.parseInt(br.readLine());
        bw.write(s.charAt(i-1));
        bw.flush();
        bw.close();
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}