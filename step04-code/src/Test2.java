public class Test2 {
    public static void main(String[] args) {
        //if red light on, then stop
        //if yellow light on, then slow
        //if green light on, then go

        //boolean
        // light on true, not on false
        boolean isLightGreen = false;
        boolean isLightYellow = false;
        boolean isLightRed = true;

        if (isLightGreen){
            System.out.println("GO!");
        }
        if (isLightYellow){
            System.out.println("Slow!");
        }
        if (isLightRed){
            System.out.println("Stop!");
        }


    }
}
