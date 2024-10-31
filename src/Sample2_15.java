public class Sample2_15 {
    public static void main(String[] args){
        int [] test = new int[10];

        test[0] = 80;
        test[1] = 90;
        test[2] = 16;
        test[3] = 40;
        test[4] = 50;

        for( int i = 0; i < 5; i++){
            System.out.print("Score of number " + (i + 1) + " is " + test[i] + " \n");
        }
    }
}
