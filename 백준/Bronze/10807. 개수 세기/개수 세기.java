import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(st.nextToken());
            if(num == v){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}