public class ArrayTest5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int number1 = arr[0];
        int number2 = arr[4];

        for (int i = 0, j = arr.length - 1; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
