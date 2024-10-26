import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total_amount = Integer.parseInt(br.readLine());
        int total_cnt = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for(int i=1;i<=total_cnt;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int price = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken());
            sum += price * cnt;
        }
        if(sum == total_amount){
            System.out.print("Yes");
        } else{
            System.out.print("No");
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}