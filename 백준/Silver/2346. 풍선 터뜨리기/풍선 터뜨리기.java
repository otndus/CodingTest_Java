import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        Deque<int[]> q = new ArrayDeque<>();
        for(int i=0; i<N; i++){
            q.offer(new int[]{i + 1, Integer.parseInt(st.nextToken())});
        }

        while(q.size() > 1){
            int[] now = q.poll();
            sb.append(now[0]).append(" ");
            if(now[1] > 0){
                for(int j=1; j<now[1]; j++){
                    q.addLast(q.pollFirst());
                }
            }else{
                for(int k=0; k<-now[1]; k++){
                    q.addFirst(q.pollLast());
                }
            }
        }
        sb.append(q.poll()[0]);
        System.out.println(sb);
    }

}