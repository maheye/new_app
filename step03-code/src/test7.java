import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        // revers practice
        //get a number
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int number = sc.nextInt();
        // 定义一个临时变量
        int temp = number;
        int num = 0;
        //using while loop
        while(number != 0){
            // get every number starting from tens
            int tens = number % 10;
            number = number / 10;
            num = num * 10 + tens;
        }
        System.out.println(num == temp );
    }
}
