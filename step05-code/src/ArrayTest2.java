public class ArrayTest2 {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i < arr1.length; i++){
            /*if (arr1[i] % 3 == 0){
                count++;
            }*/

            if (arr1[i] % 2 == 0){
                arr1[i] /= 2;
            }else{
                arr1[i] *= 2;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
}
