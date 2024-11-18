import java.io.*;
import java.util.*;
public class Main{
    public void Solution() throws Exception{
        int[] chess = {1,1,2,2,2,8};
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<chess.length;i++){
            int num = chess[i]-Integer.parseInt(st.nextToken());
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}