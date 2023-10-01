public class test8 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 37;
        int count = 0;
        while (num1 >= num2){
            num1 = num1 - num2;
            count++;
        }
        System.out.println(count);
        System.out.println(num1);
    }
}
