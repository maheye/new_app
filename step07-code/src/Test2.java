import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int[] scoreArr = getSocres();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        int max = getMax(scoreArr);
        int min = getMin(scoreArr);
        int sum = getSum(scoreArr);
        int average = (sum - max - min) /(scoreArr.length - 2);
        System.out.println(average);


    }

    public static int getSum(int[] scoreArr){
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum += scoreArr[i];
        }
        return sum;
    }
    public static int getMax(int[] scoreArr){
        int max = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if(scoreArr[i] > max){
                max = scoreArr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scoreArr){
        int min = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if(scoreArr[i] < min){
                min = scoreArr[i];
            }
        }
        return min;
    }


    public static int[] getSocres(){
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scores.length; ) {
            System.out.println("please enter a number between 0-100:");
            int score = sc.nextInt();
            if(score >= 0 && score <=100){
                scores[i] = score;
                i++;
            }else{
                System.out.println("out of range");
            }

        }
        return scores;

    }
}
