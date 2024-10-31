public class Sample2_17 {
    public static void main(String[] args){
        int[] test = new int[5];

        test[0] = 65;
        test[1] = 72;
        test[2] = 30;
        test[3] = 96;
        test[4] = 75;

        test[5] = 65;

        for(int i = 0; i < 5; i++){
            System.out.println(test[i]);
        }
    }
}
