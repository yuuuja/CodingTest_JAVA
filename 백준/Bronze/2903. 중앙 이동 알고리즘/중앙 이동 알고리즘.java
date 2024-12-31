import java.io.*;
public class Main{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int dot = 2;
        for(int i=cnt;i>0;i--){
            dot = dot*2 -1;
        }
        System.out.print(dot*dot);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}