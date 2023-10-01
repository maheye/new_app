import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        int price = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("VIP level: ");
        int vip = sc.nextInt();

        if (vip == 1){
            System.out.println("Price is " + (price * 0.9));
        }else if (vip == 2) {
            System.out.println("Price is " + (price * 0.8));
        }else if (vip == 3){
            System.out.println("Price is " + (price * 0.7));
        }else{
            System.out.println("Price is " + price);
        }
    }
}
