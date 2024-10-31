public class Sample2_19 {
    public static void main(String[] args){
        int[] test = {52, 48, 66, 98, 10};

        for( int i = 0; i < test.length; i++ ){
            System.out.println("Score of no "+ (i + 1) + " is " + test[i]);
        }

        System.out.println("There are " + test.length + " ppl attending this test.");
    }
}
