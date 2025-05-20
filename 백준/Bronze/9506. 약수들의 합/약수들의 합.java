import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while((input=br.readLine())!= null){
            int n = Integer.parseInt(input);
            if(n == -1){
                break;
            }
            
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for(int i=1;i<n;i++){
                if(n%i==0){
                    list.add(i);
                    sum += i;
                }
            }
            if(sum == n){
                bw.write(n+" = ");
                for(int i=0;i<list.size();i++){
                    bw.write(list.get(i)+"");
                    if (i != list.size() - 1) {
                        bw.write(" + ");
                    }
                }
                bw.newLine();
            } else{
                bw.write(n+" is NOT perfect.");
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}