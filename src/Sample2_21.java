import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class Sample2_21 {
    public static void main(String[] args)throws IOException{
        Integer score[] = new Integer[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Inupt score of 5 students");

        for(int i = 0; i < 5; i++){
            score[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(score, Collections.reverseOrder());

        for (int j = 0; j < 5; j++){
            System.out.print("Score of no "+ j + " is " + score[j] + " \n");
        }
    }
}
