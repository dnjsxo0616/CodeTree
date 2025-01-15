import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        printStr(num);
    }

    public static void printStr(int number) {
        for(int i=0; i<number; i++) {
            System.out.println("12345^&*()_");
        }
    }
}