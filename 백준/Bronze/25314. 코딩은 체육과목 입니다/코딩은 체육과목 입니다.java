import java.io.*;
public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for(int i=0;i<count/4;i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}