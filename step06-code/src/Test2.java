public class Test2 {
    public static void main(String[] args) {
        //define a array
        int[] arr = {1, 5, 7, 3, 8, 10};
        //call a method
        System.out.println(getMax(arr));

    }
    // define a method
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
