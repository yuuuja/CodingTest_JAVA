import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Set<String> set = new HashSet<>();
        for(int i=0;i<N;i++){
            set.add(br.readLine());
        }
        
        List<String> list = new ArrayList<>(set);
        list.sort((s1,s2) -> {
            if(s1.length() != s2.length()){
                return s1.length() - s2.length();
            } else{
                return s1.compareTo(s2);
            }
        });
            
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(String word:list){
            bw.write(word);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}