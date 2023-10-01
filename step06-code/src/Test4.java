import jdk.management.jfr.FlightRecorderMXBean;

public class Test4 {
    public static void main(String[] args) {
        //define a array
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int[] copyArr = copyOfRange(arr, 3, 7);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i]+ " ");
        }
    }

    //define a method
    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] arr1 = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            arr1[index] = arr[i];
            index++;
            }
        return arr1;
        }
}
