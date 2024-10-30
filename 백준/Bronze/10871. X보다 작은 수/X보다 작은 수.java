import java.util.*;
import java.io.*;

public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        String[] arr = str.split(" ");
        
        for(int i=0;i<N;i++){
            if(Integer.parseInt(arr[i])<X){
                bw.write(arr[i]+" ");
            }
        }
        bw.flush();
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}