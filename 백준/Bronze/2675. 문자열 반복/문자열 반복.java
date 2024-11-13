import java.io.*;
import java.util.*;
public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            String[] str = s.split("");
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<str.length;j++){
                sb.append(str[j].repeat(num));
            }
            System.out.println(sb.toString());
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}