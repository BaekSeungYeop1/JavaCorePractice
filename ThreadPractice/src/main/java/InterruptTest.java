import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterruptTest {
    public static void main(String[] args) throws IOException {
        ThreadEx5 th1 = new ThreadEx5();
        th1.start();

        System.out.println("th1.isInterrupted() = " + th1.isInterrupted()); // false
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        th1.interrupt();

        System.out.println("isInterrupted = " + th1.isInterrupted());
        // main 쓰레드가 interrupt되었는지 확인
        System.out.println("interrupted = " + th1.interrupted());

    }
}

class ThreadEx5 extends Thread{
    public void run(){
        try {
            while (true){
                System.out.println("실행중");
                Thread.sleep(30);
            }
        }catch (InterruptedException e){
            System.out.println("인터럽트 발생");
            e.printStackTrace();
        }
        System.out.println("자원 정리");
        System.out.println("실행종료");
    }
}
