import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        while(N>0){
            int num = Integer.parseInt(st.nextToken());
            count += isPrime(num)?1:0;
            N--;
        }
        System.out.println(count);
    }
    private static boolean isPrime(int num){
        if(num<=1) return false;
        if(num==2||num==3) return true;
        if(num%2==0 ||num%3==0) return false;
        for(int i=5;i*i<=num;i+=6){
            if(num%i==0 || num%(i+2)==0) return false;
        }
        return true;
    }
}