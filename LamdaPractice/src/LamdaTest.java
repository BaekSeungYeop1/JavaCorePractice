public class LamdaTest {
    public static void main(String[] args){
        new Thread(() -> {
            System.out.println("람다 Thread");
        }).start();
    }
}
