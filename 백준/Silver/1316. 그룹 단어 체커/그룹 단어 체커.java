import java.io.*;
import java.util.*;
public class Main{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = num;
        for(int i=0;i<num;i++){
            String s = br.readLine();
            List<String> list = new ArrayList<>();
            for(String gr : s.split("")){
                if(!list.isEmpty() && !list.get(list.size()-1).equals(gr) && list.contains(gr)){
                    answer--;
                    break;
                } else{
                    list.add(gr);
                }
            }
        }
        System.out.print(answer);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}