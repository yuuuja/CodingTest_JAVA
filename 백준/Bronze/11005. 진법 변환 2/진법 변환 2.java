import java.io.*;
import java.util.*;

public class Main{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        String result = "";
        while(num>0){
            if(num%B >= 10){
                result += (char)(num%B+55);
            } else{
                result += num%B;
            }
            num=num/B;
        }
        for(int i= result.length()-1;i>=0;i--){
            bw.write(result.charAt(i));            
        }
        bw.flush();
        bw.close();
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}