import java.io.*;
public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        String s= br.readLine();
        for(String str:s.split(" ")){
            if(!str.isEmpty()){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}