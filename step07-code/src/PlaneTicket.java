import java.util.Scanner;

public class PlaneTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the price: ");
        int ticketPrice = sc.nextInt();
        System.out.println("Please enter the month: ");
        int month = sc.nextInt();
        System.out.println("Please choose the cabnent, 0 First class, 1 ecnomemy:  ");
        int seat = sc.nextInt();

        if (month >= 5 && month <= 10){
            ticketPrice = getPrice(ticketPrice, seat, 0.9, 0.85);

        }else if((month <=4 && month >=1)||(month >=11 &month <=12)){
            ticketPrice = getPrice(ticketPrice, seat, 0.7, 0.65);
        }else{
            System.out.println("wrong infromation.");
        }
        System.out.println(ticketPrice);
    }
    public static int getPrice(int ticketPrice, int seat, double v0, double v1){
        if (seat == 1){
            ticketPrice = (int) (ticketPrice * v1);
        }else if (seat ==0){
            ticketPrice = (int) (ticketPrice * v0);
        }else{
            System.out.println("wrong information");
        }
        return ticketPrice;
    }
}
