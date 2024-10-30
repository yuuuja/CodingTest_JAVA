import java.util.*;
import java.io.*;

public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        int[] arr = new int[N];
        for(int i=0;i<M;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
            int a=Integer.parseInt(st2.nextToken());
            int b=Integer.parseInt(st2.nextToken());
            int c=Integer.parseInt(st2.nextToken());
            for(int j=a;j<=b;j++){
                arr[j-1]=c;
            }
        }
        for(int i=0;i<N;i++){
            bw.write(arr[i]+" ");
        }
        bw.flush();
        
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}