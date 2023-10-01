public class MethodDemo5 {
    public static void main(String[] args) {

        double area1 = getArea(5.5, 1.7);
        double area2 = getArea(2.4, 2.7);

        if (area1 > area2){
            System.out.println("1");
        }else{
            System.out.println("2");
        }
    }

    public static double getArea(double len, double width){
        double result =  len * width;
        return result;
    }

}
