import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_4 {
    public static void main(String[] args)throws IOException{
        System.out.println("input a integer");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if (num == 1){
            System.out.println("input 1");
        }else if (num ==2){
            System.out.println("input 2");
        }else{
            System.out.println("input neither 1 nor 2");
        }
     }
}
