import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        for(int x=1;x<=T;x++){
            int N = Integer.parseInt(br.readLine());
            Set<Integer> numSet = new HashSet<>();
            
            if(N==0){
                bw.write("Case #"+x+": INSOMNIA");
                bw.newLine();
                continue;
            }
            
            // i*N 번 반복
            for(int i=1;i<1000000;i++){
                if(count(i*N, numSet)){
                    bw.write("Case #"+x+": "+i*N);
                    bw.newLine();
                    break;
                }
            }            
        }
        bw.flush();
        bw.close();
    }
    private static boolean count(int N, Set<Integer> numSet) {
        while(N>0){
            numSet.add(N%10);
            N/=10;
        }
        return numSet.size() == 10;
    }
}