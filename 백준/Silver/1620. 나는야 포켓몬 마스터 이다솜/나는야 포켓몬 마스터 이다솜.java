import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, String> pokemons = new HashMap<>();

        for(int i=0; i<N; i++){
            String p = br.readLine();
            String num = Integer.toString(i+1);
            pokemons.put(num, p);
            pokemons.put(p, num);
        }

        for(int i=0; i<M; i++){
            String p = br.readLine();
            sb.append(pokemons.get(p)).append('\n');
        }
        System.out.println(sb);
    }
}