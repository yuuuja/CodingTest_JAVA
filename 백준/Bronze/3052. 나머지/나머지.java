import java.io.*;
import java.util.*;
public class Main{
    public void Solution() throws Exception{
        int[] numbers = new int[42];
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<=9;i++){
            int num = Integer.parseInt(br.readLine());
            numbers[num%42]+=1;
        }
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>=1){
                count++;
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}