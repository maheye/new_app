import java.util.Scanner;


public class ScannerDemo1 {
    public static void main(String[] args){
        //Create an object to indicate that I am going to use Scanner 
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        //receive data
        //i records the keyboard
        int i = sc.nextInt();
        System.out.println(i);



    }
}
