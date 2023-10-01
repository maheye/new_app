public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr = {33, 5, 22, 44, 55};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }

        }
        System.out.println(max);

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
