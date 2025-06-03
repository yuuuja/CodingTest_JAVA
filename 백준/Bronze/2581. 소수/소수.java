import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        
        List<Integer> list = new ArrayList<>();
        for(int i=M;i<=N;i++){
            if(isPrime(i)){
                sum+=i;
                list.add(i);
            }
        }
        if(list.size()==0 && sum==0){
            System.out.println(-1);
        } else{
            System.out.println(sum);
            System.out.println(list.get(0));
        }
        
    }
    private static boolean isPrime(int num){
        if(num<=1) return false;
        if(num==2 || num==3) return true;
        if(num%2==0 || num%3==0) return false;
        for(int i=5;i*i<=num;i+=6){
            if(num%i==0 || num%(i+2)==0) return false;
        }
        return true;
    }
}