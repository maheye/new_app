import java.util.Scanner;

public class SwitchPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int number = sc.nextInt();

        switch (number){
            case 1 -> System.out.println("Search");
            case 2 -> System.out.println("Order");
            case 3 -> System.out.println("Change");
            //case 4 -> System.out.println("Exit");
            default -> System.out.println("Exit");
        }
    }
}
