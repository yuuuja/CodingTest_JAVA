import java.io.*;
public class Main{
    public void Solution() throws Exception{
        int[] arr = new int[26];
        for(int i=0;i<arr.length;i++){
            arr[i] = -1;
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==-1){
                arr[s.charAt(i)-'a']=i;
            }
        }
        for(int i=0;i<arr.length;i++){
            bw.write(arr[i]+" ");
        }
        bw.flush();
        bw.close();
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}