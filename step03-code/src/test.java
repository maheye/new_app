public class test {
    public static void main(String[] args) {
        //求1 - 100 中的偶数和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
