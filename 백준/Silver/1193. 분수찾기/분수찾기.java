import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        
        int line =1;
        int sum = 0;
        while(sum +line<X){
            sum+=line;
            line++;
        }
        
        int idx = X-sum; //현재 대각선에서 몇번째인지
        int numerator = 0; //분자
        int denominator = 0; //분모
        
        if(line % 2==0){
            //짝수일 때 아래방향
            denominator = line - idx +1;
            numerator = idx;
            
        } else{
            denominator = idx;
            numerator = line - idx +1;
        }
        System.out.println(numerator+"/"+denominator);
    }
}