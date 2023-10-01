public class ArrayDemo3 {
    public static void main(String[] args) {
        // add 50 names in the array.

        String[] arr = new String[50];

        //add names
        arr[0] = "Austin";
        arr[1] = "Kai";

        //output

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //string default value is null
        //int default value is 0
        //double default value is 0.0
        // char default value is '/u0000' space
        // boolean default value is false

        int[] arr2 = new int[3];
        System.out.println(arr2[0]);

    }
}
