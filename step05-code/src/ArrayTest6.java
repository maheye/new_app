import java.util.Random;

public class ArrayTest6 {
    public static void main(String[] args) {
        //随机交换数组中的顺序

        //get an array
        int[] arr = {1,2,3,4,5};

        Random r = new Random();



        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int tem = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = tem;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
