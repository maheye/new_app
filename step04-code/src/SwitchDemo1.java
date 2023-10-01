public class SwitchDemo1 {
    public static void main(String[] args) {
        // practice switch

        String noodles = "do not know";

        switch (noodles){
            case "cup noodles":
                System.out.println("Eat this noodle");
                break;
            case "noodle":
                System.out.println("This is a different noodle");
                break;
            default:
                System.out.println("Eat this kind of noodle");
                break;
        }
    }
}
