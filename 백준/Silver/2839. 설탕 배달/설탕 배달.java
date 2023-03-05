import java.io.*;

public class Main {
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(recur(N));

    }
    static int recur(int N){
        if(N == 0){
            return result;
        }
        else if(N%5 == 0){
            return result += N/5;
        }
        else if(N-3 >= 0){  
            result++;
            return recur(N-3);
        }
        return -1;
    }
}