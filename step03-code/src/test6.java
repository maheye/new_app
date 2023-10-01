public class test6 {
    public static void main(String[] args) {
        int count = 0;
        double height = 0.1;
        while (height < 8844430){
            height = height * 2;
            count += 1;
        }
        System.out.println(count);
    }
}
