import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        char[] wheel = new char[N];
        Arrays.fill(wheel, '?');
        Set<Character> used = new HashSet<>();
        int pointer = 0;
        
        while(K>0){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int move = Integer.parseInt(token.nextToken());
            char alphabet = token.nextToken().charAt(0);
            pointer = (pointer+move) % N;
            
            if(wheel[pointer] == '?'){
                if(used.contains(alphabet)){
                    System.out.println("!");
                    return;
                } else{
                    wheel[pointer] = alphabet;
                    used.add(alphabet);
                }
            } else if(wheel[pointer] != alphabet){
                System.out.println("!");
                return; 
            }
            K--;
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(wheel[(pointer - i + N) % N]);
        }
    }
}