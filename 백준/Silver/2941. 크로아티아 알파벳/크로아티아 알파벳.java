import java.io.*;
import java.util.*;
public class Main{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr= {"c=","c-","dz=","d-","lj","nj","s=","z="};
        
        int cnt=0;
        for(String str : arr){
            while(s.contains(str)){
                s=s.replaceFirst(str," ");
                cnt++;
            }
        }
        System.out.print(cnt+s.replace(" ","").length());
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}