import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if(a==0 && b==0){
                break;
            }
            
            if(a%b==0){
                System.out.println("multiple");
            }
            else if(b%a==0){
                System.out.println("factor");
            }
            else{
                System.out.println("neither");
            }
        }
    }
}