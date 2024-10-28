import java.util.StringTokenizer;
import java.io.*;

public class Main{
    public void Solution() throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==0 && b==0){
                break;
            } else{
                System.out.println(a+b);
            }
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}