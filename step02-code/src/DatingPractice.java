import java.util.Scanner;

public class DatingPractice {
    public static void main(String[] args) {

        //to get two int numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int number = sc.nextInt();

        System.out.println("Please enter another number: ");
        int number2 = sc.nextInt();
        boolean result = number > number2;
        System.out.println(result);
    }
}
