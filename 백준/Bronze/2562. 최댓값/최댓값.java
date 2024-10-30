import java.io.*;
public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0;
        int index = 0;
        for(int i=1;i<=9;i++){
            int num = Integer.parseInt(br.readLine());
            if(num>max){
                max=num;
                index=i;
            }
        }
        bw.write(max+"\n"+index);
        bw.flush();
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}