import java.util.Random;

public class ArrayTest7 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        Random r = new Random();

        for (int i = 0; i < arr.length; i++ ){
            int randomIndex = r.nextInt(arr.length);
            int temNumber = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temNumber;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
