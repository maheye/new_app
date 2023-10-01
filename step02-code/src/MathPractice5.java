import java.util.Scanner;

public class MathPractice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please give a number:");
        int number = sc.nextInt();

        System.out.println("Please give a number: ");
        int number1 = sc.nextInt();

        String result = number == number1 ? "same" : "different";
        System.out.println(result);

        System.out.println(number > number1 ? number : number1);

        int height1 = 150;
        int height2 = 165;
        int height3 = 210;

        int temp =  height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;
        System.out.println(max);


    }
}
