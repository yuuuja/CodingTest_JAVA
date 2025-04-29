import java.util.*;
import java.io.*;
public class Main{
    static int[][] memo = new int[31][31];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            System.out.println(combination(M,N));
            
        }
    }
    public static int combination(int m, int n){
        if(n==0 ||m==n){
            return 1;
        }
        if (memo[m][n] != 0) return memo[m][n]; // 이미 계산된 경우

        return memo[m][n] = combination(m - 1, n - 1) + combination(m - 1, n);
    }
}