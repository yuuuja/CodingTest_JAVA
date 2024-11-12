import java.io.*;
import java.util.Arrays;
public class Main{
    public void Solution() throws Exception{ 
        int[] students = new int[30];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<28;i++){
            int number = Integer.parseInt(br.readLine());
            students[number-1]=1;
        }
        for(int i=0;i<students.length;i++){
            if(students[i]!=1){
                System.out.println(i+1);
            }
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}