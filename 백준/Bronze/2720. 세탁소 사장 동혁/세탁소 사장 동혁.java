import java.io.*;
import java.util.*;

public class Main{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0;i<T;i++){
            int C = Integer.parseInt(br.readLine());
            int Quater =0; // 0.25
            int Dime = 0; // 0.10
            int Nickel = 0; // 0.05
            int Penny = 0;  // 0.01
            
            Quater = C/25;
            C=C%25;
            Dime = C/10;
            C=C%10;
            Nickel = C/5;
            Penny = C%5;
            bw.write(Quater+" "+ Dime +" "+Nickel +" "+Penny+"\n");
        }
        bw.flush();
        bw.close();
        
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}