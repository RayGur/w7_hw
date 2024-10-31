import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_7 {
    public static void main(String[] args)throws IOException{
        System.out.println("Are you a boy?\nPlease insert Y/N.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char ans = br.readLine().charAt(0);
        // =>
        //String str = br.readLine();
        //char letter = str.charAt(0);\

        if(ans == 'Y' || ans == 'y'){
            System.out.println("You are a boy");
        }else if(ans == 'N' || ans == 'n') {
            System.out.println("You are a girl");
        }else{
            System.out.println("Please insert Y/N.");
        }
    }
}
