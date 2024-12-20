import java.util.*;
import java.io.*;

public class Main{
    public void solution() throws Exception{
        Map<String, Double> rates = new HashMap<>();
        rates.put("A+",4.5);
        rates.put("A0",4.0);
        rates.put("B+",3.5);
        rates.put("B0",3.0);
        rates.put("C+",2.5);
        rates.put("C0",2.0);
        rates.put("D+",1.5);
        rates.put("D0",1.0);
        rates.put("F",0.0);
        
        double total_sum = 0.0;
        double score_sum = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        for(int i=0;i<20;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String rate = st.nextToken();
            
            if(!rate.equals("P")){
                score_sum += score;
                total_sum += score * rates.get(rate);
            }
        }
        
        System.out.print(total_sum / score_sum);
        
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}