import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int number = sc.nextInt();

        if (number >=0 && number<= 100){
            if (number % 2 == 1){
                System.out.println("Your seat is on the left");
            }else{
                System.out.println("Your seat is on the right");

            }
        }else{
            System.out.println("This is a wrong number.");
        }

    }
}
