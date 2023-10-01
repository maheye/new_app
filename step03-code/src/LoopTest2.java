import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number bigger than 2: ");
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            if (i * i == x){
                System.out.println(i);
                break;
            }else if (i * i > x) {
                System.out.println(i - 1);
                break;
            }
        }

    }
}
