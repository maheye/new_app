import java.util.Random;

public class Verification {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i < 26){
                chs[i] = (char)(97 + i);
            }else{
                chs[i] = (char)(65 + i - 26);
            }
        }
        String result = "";
        Random r = new Random();

        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result += chs[randomIndex];
        }
        int number = r.nextInt(10);
        result += number;
        System.out.println(result);
    }


}
