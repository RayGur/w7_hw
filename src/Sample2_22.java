public class Sample2_22 {
    public static void main(String[] args){
         int[][] score = new int[2][5];

         score[0][0] = 80;
         score[0][1] = 52;
         score[0][2] = 86;
         score[0][3] = 91;
         score[0][4] = 45;
         score[1][0] = 23;
         score[1][1] = 90;
         score[1][2] = 98;
         score[1][3] = 42;

         for(int i = 0; i < score[1].length; i++){
             System.out.println("English score of student " + i + " is: " + score[0][i]);
             System.out.println("Math score of student " + i + " is: " + score[1][i]);
         }
    }
}
