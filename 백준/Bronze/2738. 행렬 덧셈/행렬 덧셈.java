import java.io.*;
import java.util.*;
public class Main{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[][] arr_A = new int[N][M];
        int[][] arr_B = new int[N][M];
        for(int i=0;i<N;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                arr_A[i][j]=Integer.parseInt(st1.nextToken());
            }
        }
        for(int i=0;i<N;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                arr_B[i][j]=Integer.parseInt(st2.nextToken());
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(arr_A[i][j] + arr_B[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}