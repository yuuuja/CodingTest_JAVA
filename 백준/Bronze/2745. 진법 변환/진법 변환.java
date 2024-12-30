import java.util.*;
import java.io.*;
public class Main{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        System.out.print(Long.parseLong(N,B));
        
        
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}