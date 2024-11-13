import java.io.*;
import java.util.*;
public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String str1 = new StringBuilder(st.nextToken()).reverse().toString();
        String str2 = new StringBuilder(st.nextToken()).reverse().toString();
        
        if(Integer.parseInt(str1)>Integer.parseInt(str2)){
            System.out.print(str1);
        }else{
            System.out.print(str2);
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}