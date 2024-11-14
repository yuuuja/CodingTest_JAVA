import java.io.*;
public class Main{
    public void Solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sum = 0;
        for(int i=0;i<s.length();i++){
            if ("ABC".contains(String.valueOf(s.charAt(i)))){
                sum+=3;
            } else if("DEF".contains(String.valueOf(s.charAt(i)))){
                sum+=4;
            } else if("GHI".contains(String.valueOf(s.charAt(i)))){
                sum+=5;
            } else if("JKL".contains(String.valueOf(s.charAt(i)))){
                sum+=6;
            } else if("MNO".contains(String.valueOf(s.charAt(i)))){
                sum+=7;
            } else if("PQRS".contains(String.valueOf(s.charAt(i)))){
                sum+=8;
            } else if("TUV".contains(String.valueOf(s.charAt(i)))){
                sum+=9;
            } else{
                sum+=10;
            }
        }
        System.out.print(sum);
    }
    public static void main(String[] args) throws Exception{
        new Main().Solution();
    }
}