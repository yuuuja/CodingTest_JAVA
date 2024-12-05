import java.io.*;
import java.util.*;
public class Main{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        int max = 0;
        char answer ='?';
        boolean max_check = false;
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(max< entry.getValue()){
                max = entry.getValue();
                answer = entry.getKey();
                max_check = false;
            } else if(entry.getValue() == max){
                max_check = true;
            }
        }
        System.out.print(max_check?'?':answer);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}