import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        Set<Integer> divisors = new TreeSet<>();
        
        for(int i=1;i*i<=N;i++){
            if (N % i == 0) {
                divisors.add(i);
                divisors.add(N/i);
            }
        }
        
        List<Integer> list = new ArrayList<>(divisors);
        if(K > list.size()){
            System.out.println(0);
        } else{
           System.out.println(list.get(K-1)); 
        }  
    }
}