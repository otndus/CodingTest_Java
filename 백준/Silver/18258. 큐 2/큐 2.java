import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<>();

        while(N-- > 0){
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()){
                case "push":
                    q.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(q.isEmpty()){
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(q.poll()).append('\n');
                    }
                    break;
                case "size":
                    sb.append(q.size()).append('\n');
                    break;
                case "empty":
                    if(q.isEmpty())
                        sb.append(1).append('\n');
                    else sb.append(0).append('\n');
                    break;
                case "front":
                    if(q.isEmpty()){
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(q.peek()).append('\n');
                    }
                    break;
                case "back":
                    if(q.isEmpty()){
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(q.getLast()).append('\n');
                    }
            }
        }
        System.out.println(sb);
    }
}