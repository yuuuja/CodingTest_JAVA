import java.io.*;
import java.util.*;
public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = 0;
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            if(arr[i] > M){
                M = arr[i];
            }
        }
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] / (double) M * 100.0;
        }
        System.out.print(sum/N);
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}