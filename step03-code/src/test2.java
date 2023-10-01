public class test2 {
    public static void main(String[] args) {
        // 断线连接最多五次
        for (int i = 1; i <= 5; i++){
            System.out.println("reconnecting" + i);
        }
    }
}
