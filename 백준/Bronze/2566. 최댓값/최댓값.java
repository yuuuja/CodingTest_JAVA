import java.io.*;
import java.util.*;
public class Main{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int row = 0;
        int column = 0;
        
        for(int i=1;i<=9;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1;j<=9;j++){
                int num = Integer.parseInt(st.nextToken());
                if(num > max){
                    max = num;
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + column);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}