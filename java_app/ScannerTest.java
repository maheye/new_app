import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        //crate object 
        Scanner sc = new Scanner(System.in);
        //receive data
        System.out.println("Please enter the frist number: ");
        int number1 = sc.nextInt();
        
        System.out.println("Please enter the second number: ");
        //second data
        int number2 = sc.nextInt();
        

        // 1 add 2
        System.out.println(number1 + number2);


    }
}
