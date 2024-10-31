import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_20 {
    public static void main(String[] args)throws IOException{
        int[] score = new int[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Inupt score of 5 students");

        for (int i = 0; i < score.length; i++){
            int num = Integer.parseInt(br.readLine());
            score[i] = num;
        }

        //bubble sort
        for (int s = 0; s < score.length - 1; s++){
            for (int t = s + 1; t < score.length; t++){
                if(score[t] > score[s]){
                    int tmp = score[t];
                    score[t] = score[s];
                    score[s] = tmp;
                }
            }
        }

        for (int j = 0; j < 5; j++){
            System.out.print("Score of no "+ j + " is " + score[j] + " \n");
        }
    }
}
