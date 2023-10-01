public class MethodDemo3 {
    public static void main(String[] args) {
        getLength(5.2, 1.3);
        getArea(1.5);
    }
    public static void getLength(double len, double width){
        double result = (len + width) * 2;
        System.out.println(result);
    }

    public static void getArea(double radius){
        double result = radius * radius * 3.14;
        System.out.println(result);
    }

}
