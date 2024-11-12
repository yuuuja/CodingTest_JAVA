import java.io.*;
public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while(T>0){
            String s = br.readLine();
            if(s.length()==1){
                bw.write(s+s+"\n");
            } else{
                bw.write(String.valueOf(s.charAt(0))+s.charAt(s.length()-1)+"\n");
            }
            T--;
        }
        bw.flush();
        bw.close();
        
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}