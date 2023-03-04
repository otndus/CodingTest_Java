import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            dp = new int[M + 1][N + 1];

            sb.append(BC(M, N)).append('\n');
        }
        System.out.println(sb);
    }

    public static int BC(int M, int N){
        if(dp[M][N] > 0){
            return dp[M][N];
        }
        if(N == 0 || M == N){
            dp[M][N] = 1;
        }
        else{
            dp[M][N] = BC(M - 1, N - 1) + BC(M - 1, N);
        }
        return dp[M][N];
    }
}