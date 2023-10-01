import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        System.out.println("please enter a number: ");
        int number2 = sc.nextInt();
        int result = 0;
        for (int i = number; i <= number2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result += 1; //result++;
            }
        }

        System.out.println(result);

    }
}
