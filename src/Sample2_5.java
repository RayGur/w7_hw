import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_5 {
    public static void main(String[] args)throws IOException{
        System.out.println("input a int");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        switch(num){
            case 1:{
                System.out.println("input 1");
                break;
            }
            case 2:{
                System.out.println("input 2");
                break;
            }
            default:{
                System.out.println("please input 1 or 2");
                break;
            }
        }
    }
}
