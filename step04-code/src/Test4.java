import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an amount: ");
        int money = sc.nextInt();
        if (money > 600){
            System.out.println("successful!");
        }else{
            System.out.println("denied!");
        }
    }
}
