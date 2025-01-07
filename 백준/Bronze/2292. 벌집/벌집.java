import java.io.*;

public class Main{
    private Integer solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
  
        int start = 1;
        int room_cnt = 1; // 벌집 방의 수
        while(true){
            if(N >= start && N <= start+6*(room_cnt -1)){
                return room_cnt;
            }
            start = start + 6*(room_cnt -1);
            room_cnt++;
        }
    }
    public static void main(String[] args) throws Exception{
        Main main = new Main();
        System.out.println(main.solution());
    }
}