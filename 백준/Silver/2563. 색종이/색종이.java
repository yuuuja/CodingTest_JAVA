import java.util.*;
import java.io.*;
public class Main{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int total_extent = 0;
        boolean[][] paper = new boolean[100][100];
        
        for(int i=0;i<cnt;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            for(int row=y; row<y+10;row++){
                for(int col=x;col<x+10;col++){
                    if(!paper[row][col]){
                        paper[row][col] = true;
                        total_extent++;
                    }
                }
            }
        }
        System.out.print(total_extent);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}