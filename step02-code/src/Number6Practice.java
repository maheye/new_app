import java.util.Scanner;

public class Number6Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number1 = sc.nextInt();

        System.out.println("Please enter a number: ");
        int number2 = sc.nextInt();

        boolean result = number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0;
        System.out.println(result);
    }
}
