import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_1 {
    public static void main(String[] args)throws IOException {
        System.out.println("input a int");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if (num == 1){
            System.out.println("input 1");
            System.out.println("chose 1");
        }

        System.out.println("end of program");
    }
}
