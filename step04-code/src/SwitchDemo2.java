import java.util.Scanner;

public class SwitchDemo2 {
    //休息日和工作日
    //需求：键盘录入星期数，输入工作日，休息日。
    //1-5工作日，6-7休息日
    public static void main(String[] args) {
        //input data using scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();

        //using if
        if (number >=1 && number <= 5){
            System.out.println("Weekday");
        }else if (number >=6 && number <=7) {
            System.out.println("Weekend");
        }else {
            System.out.println("This is a wrong number.");
        }

        // using switch
        System.out.println("Please enter a number: ");
        int number1 = sc.nextInt();

        switch (number1){
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("This is a wrong number.");
        }
    }
}
