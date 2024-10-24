import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());
        
        minute+=time;
        
        if(minute>=60){
            hour+=minute/60;
            minute=minute%60;
        }
        hour = hour%24;
        System.out.print(hour+" "+minute);
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}