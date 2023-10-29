public class JoinTest {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadEx6 th1 = new ThreadEx6();
        ThreadEx7 th2 = new ThreadEx7();

        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();

        try {
            th1.join();
            th2.join();
        }catch (InterruptedException e){}

        System.out.println("소요시간: " + (System.currentTimeMillis() - startTime));
    }
}

class ThreadEx6 extends Thread{
    public void run(){
        for(int i = 0; i<300; i++){
            System.out.println(new String("-"));
        }
    }
}
class ThreadEx7 extends Thread{
    public void run(){
        for(int i = 0; i<300; i++){
            System.out.println(new String("|"));
        }
    }
}