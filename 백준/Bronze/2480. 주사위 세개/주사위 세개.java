import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        if(a==b && b==c && a==c){
            System.out.print(10000+a*1000);
        } else if((a==b && b!=c) ||
             (a==c && b!=c) ){
            System.out.print(1000+a*100);
        } else if(b==c && a!=c){
            System.out.print(1000+c*100);
        } else{
            System.out.print(Math.max(a,Math.max(b,c))*100);
        }
        
        
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}