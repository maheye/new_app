import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        //需求：键盘录入一个正整数x，判断该整数是否为一个质数

        //质数：如果一个数只能被1和本身整除，那么这个数为质数，否则为合数

        //get a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();

        boolean flag = true;
        // write a loop, starting from 2 until number -1
        for (int i = 2; i < number; i++) {

            if (number % i == 0){
                flag = false;
                //System.out.println("this is not a zhishu");
                break;
            }
        }
        if (flag){
            System.out.println("This is a zhishu");
        }else{
            System.out.println("this is not a zhishu");
        }


    }
}
