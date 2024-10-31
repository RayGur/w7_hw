import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_8 {
    public static void main(String[] args) throws IOException {
        System.out.println("choose a road.\nInsert a Integer.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        // num == 1 => A, esle B

        char and = (num == 1)? 'A':'B';

        System.out.println(and);
    }
}
