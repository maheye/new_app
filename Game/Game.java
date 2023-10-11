import java.util.Random;
import java.util.Scanner;

public class Game {
    // This is a lottery game, and the betting numbers consist of six red ball numbers and one blue ball number.
    //The red ball numbers can be chosen from 1-33; the blue ball numbers can be chosen from 1-16.
    public static void main(String[] args) {
        //生成中奖号码， 一共7个数
        int[] arr = crateNumber();
        //print out the random number
        System.out.println("=======================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("=======================");
        //call the userInputNumber method
        int[]userInputArr = userInputNumber();
        //判断中奖情况
        int redCount = 0;
        int blueCount = 0;
        //判断红球
        for (int i = 0; i < userInputArr.length - 1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if(redNumber == arr[j]){
                    redCount++;
                    break;
                }
            }
        }

        //判断蓝球
        int blueNumber = userInputArr[userInputArr.length - 1];
        if(blueNumber == arr[arr.length - 1]){
            blueCount++;
        }

        //判断中奖金额
        if(redCount == 6 && blueCount == 1){
            System.out.println("You got 10 million dollars!");
        }else if(redCount == 6 && blueCount == 0){
            System.out.println("You got 5 million dollars!");
        }else if(redCount == 5 && blueCount == 1){
            System.out.println("You got 5000 dollars!");
        }else if((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)){
            System.out.println("You got 200 dollars!");
        }else if((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)){
            System.out.println("You got 100 dollars!");
        }else if((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)){
            System.out.println("You got 5 million dollars!");
        }else{
            System.out.println("Thank for your participate.");
        }
    }
    // To get user input numbers
    public static int[] userInputNumber(){
        int[] arr = new int[7];
        // use scanner
        Scanner sc = new Scanner(System.in);
        // use for loop to get all 6 numbers range from 1 to 33.
        for (int i = 0; i < 6; ) {
            System.out.println("Please enter" + (i+1) + " red number");
            int redNumber = sc.nextInt();
            //redNumber should be 1 - 33, and only appear once
            if(redNumber >= 1 && redNumber <= 33){
                boolean flag = contains(arr, redNumber);
                if(!flag){
                    //valid and can be added
                    arr[i] = redNumber;
                    i++;
                }else{
                    //invalid, enter another one
                    System.out.println("Please enter another number!");
                }
            }else{
                System.out.println("this number is out of range!");
            }
        }

        //to get a blue number
        System.out.println("please enter a blue number: ");
        int blueNumber = sc.nextInt();
        // use while loop to make sure the blue number is in the correct range.
        while(true){
            if(blueNumber >=1 && blueNumber <= 16){
                arr[6] = blueNumber;
                break;
            }else{
                System.out.println("this is a wrong number.");
            }
        }
        return arr;
    }

    // to get 6 random number in the red area and 1 in the blue area.
    public static int[] crateNumber(){
        //7 位数号码
        int[] arr = new int[7];
        // use random to creat the numbers in the arr
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            //生成红色号码
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if(!flag){
                //add the number to the arr
                arr[i] = redNumber;
                i++;
            }
        }

        //生成蓝球号码并添加到数组当中
        int blueNumber = r.nextInt(16) + 1;
        arr[6] = blueNumber;
        return arr;
    }

    //用于判断数字在数组中是否存在
    public static boolean contains(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }

}
