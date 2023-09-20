public class BusCountingActivity {
    public static void main (String[] args){
        //no guests at first
        int count = 0;

        //first stop, one guest joined, count + 1
        count = count + 1;
        System.out.println(count);

        //second stop, 2 joined and 1 left
        count = count + 2 - 1;
        System.out.println(count);
    }
}
