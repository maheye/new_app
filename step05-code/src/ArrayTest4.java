import java.util.Random;

public class ArrayTest4 {
    public static void main(String[] args) {
        // use random to get 100 numbers
        Random r = new Random();

        // get a new array
        int[] arr = new int[10];

         //put these numbers in the array
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100)+1;
            arr[i] = number;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // sum all numbers
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The total is " + sum);

        sum /= arr.length;
        System.out.println("The average number is " + sum);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < sum){
                count++;
            }
        }
        System.out.println("There are "+ count);



    }
}
