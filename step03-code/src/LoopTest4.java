import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class LoopTest4 {
    public static void main(String[] args) {
        //get a random number
        Random r = new Random();
        int number = r.nextInt(100) + 1;//starting from 1 to 100
        // get a guessed number
        Scanner sc = new Scanner(System.in);
        int count = 0;
        //using while loop to compare random number and guessed number, and repeat if they are not the same
        while(true){
            System.out.println("Please guess a number");
            int guess = sc.nextInt();

            count++;
            if (count == 3){
                System.out.println("No chance left!");
                break;
            }
            if (number > guess){
                System.out.println("lower");
            }else if (number < guess){
                System.out.println("higher");
            }else{
                System.out.println("yes, you got it right! the number is" + guess);
                break;
            }
        }
    }
}
