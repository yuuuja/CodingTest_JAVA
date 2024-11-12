import java.io.*;
public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.print((int)s.charAt(0));
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}