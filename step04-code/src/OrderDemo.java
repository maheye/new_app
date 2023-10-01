import java.sql.SQLOutput;
import java.util.Scanner;

public class OrderDemo {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");

        //practice if statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int wine = sc.nextInt();
        if (wine > 2){
            System.out.println("This number is bigger than 2");
        }

    }
}
