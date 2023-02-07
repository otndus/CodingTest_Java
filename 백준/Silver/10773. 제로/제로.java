import java.io.*;

public class Main {

    public static int[] account;
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        account = new int[K];
        int sum = 0;

        while(K-- > 0){
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                account[size-1] = 0;
                size--;
            }
            else{
                account[size] = input;
                size++;
            }
        }

        for(int item : account){
            sum+=item;
        }
        System.out.println(sum);
    }
}