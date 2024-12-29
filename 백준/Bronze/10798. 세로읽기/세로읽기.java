import java.util.*;
import java.io.*;
public class Main{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] s_arr = new String[5][15];
        int len = 0;
        for(int i=0;i<5;i++){
            s_arr[i] = br.readLine().split("");
            if(s_arr[i].length > len){
                len = s_arr[i].length;
            }
        }
        for(int i=0; i<len;i++){
            for(int j=0;j<5;j++){
                if(i < s_arr[j].length && s_arr[j][i]!=null && !s_arr[j][i].isEmpty()){
                    bw.write(s_arr[j][i]);
                }
            }  
        }
        bw.flush();
        bw.close();
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}