import java.util.Scanner;

public class SwitchPractice1 {
    public static void main(String[] args) {
        // practice switch
        //record your exercise plan for the week

        Scanner sc = new Scanner(System.in);
        System.out.println("What day is it day? ");
        int date = sc.nextInt();
        switch (date){
            case 1:
                System.out.println("running");
                break;
            case 2:
                System.out.println("swimming");
                break;
            case 3:
                System.out.println("walking");
                break;
            case 4:
                System.out.println("biking");
                break;
            case 5:
                System.out.println("boxing");
                break;
            case 6:
                System.out.println("hiking");
                break;
            default:
                System.out.println("resting");
                break;
        }
    }
}
