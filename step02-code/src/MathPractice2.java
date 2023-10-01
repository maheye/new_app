import java.util.Scanner;

public class MathPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an three number int:" );
        int number = sc.nextInt();

        // get a ten,
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;

        System.out.println("The single digit is " + ge);
        System.out.println("The The tens digit is " + shi);
        System.out.println("The hundreds digit is " + bai);

    }
}
