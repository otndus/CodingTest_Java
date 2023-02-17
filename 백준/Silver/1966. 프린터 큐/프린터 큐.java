import java.util.*;
import java.io.*;

public class Main {
    static int T, N, M, count;
    static Queue<int[]> q;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for(int i=0; i<N; i++){
                q.offer(new int[] {Integer.parseInt(st.nextToken()), i});
            }

            count = 0;
            while(!q.isEmpty()){
                int[] now = q.poll();
                boolean isMax = true;
                for(int[] qu : q){
                    if(now[0] < qu[0]){
                        isMax = false;
                    }
                }
                if(isMax){
                    count++;
                    if(now[1] == M) break;
                }
                else q.offer(now);
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }

}