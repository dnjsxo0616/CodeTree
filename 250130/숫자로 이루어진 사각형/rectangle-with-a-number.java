import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());

        printNum(s);
    }

    public static void printNum(int n) {
        int num = 1;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(num + " ");
                num++;
                if(num == 10) {
                    num = 1;
                }
            }
            System.out.println();
        }
    }
}