import java.util.*;
import java.io.*;

public class Main {
    static int M, N;
    static int[][] map;
    static int[][] dp;
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken()); // 세로
        N = Integer.parseInt(st.nextToken()); // 가로

        map = new int[M][N];
        dp = new int[M][N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1; // 아직 방문 안 했음을 의미
            }
        }

        System.out.println(dfs(0, 0));
    }

    static int dfs(int x, int y) {
        if (x == M - 1 && y == N - 1) return 1; // 도착 지점

        if (dp[x][y] != -1) return dp[x][y]; // 이미 계산한 경로 수

        dp[x][y] = 0; // 초기화

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 범위 체크 + 더 낮은 곳으로만 이동
            if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                if (map[nx][ny] < map[x][y]) {
                    dp[x][y] += dfs(nx, ny);
                }
            }
        }

        return dp[x][y];
    }
}
