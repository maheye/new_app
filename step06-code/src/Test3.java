public class Test3 {
    public static void main(String[] args) {
        //define an array
        int[] arr = {1, 5, 8, 12, 56, 89, 34, 67};

        //call a method
        System.out.println(contains(89, arr));
    }

    // define a method
    public static boolean contains(int number, int[] arr){
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                result = true;
            }
        }
        return result;

    }
}
