import java.io.*;

public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(arr[i]);
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
        }
        bw.write(min+" "+max);
        bw.flush();
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}