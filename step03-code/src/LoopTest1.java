public class LoopTest1 {
    public static void main(String[] args) {
        int beginNumber = 2;

        for (int i = beginNumber; i <= 100 ; i++) {

            if ( i % 7 == 0 || i / 10 % 10 == 7 || i % 10 == 7){
                System.out.println("pass");
                continue;
            }
            System.out.println(i);
        }
    }
}
