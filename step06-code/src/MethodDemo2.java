public class MethodDemo2 {
    public static void main(String[] args) {
        //getSum();

        getResult(10, 20);
    }
    public static void getSum(){
        int num = 10;
        int num2 = 20;

        int result = num + num2;
        System.out.println(result);
    }

    public static void getResult(int num, int num2){
        int result = num + num2;
        System.out.println(result);
    }
}
