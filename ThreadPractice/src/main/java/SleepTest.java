public class SleepTest {
    public static void main(String[] args) {
        ThreadEx3 th1 = new ThreadEx3();
        ThreadEx4 th2 = new ThreadEx4();
        th1.start();;
        th2.start();

        delay(2*1000);
        System.out.print("<<main 종료>>");
    }

    static void delay(long millis){
        try {
            Thread.sleep(millis);
        }catch (InterruptedException e){}
    }
}
class ThreadEx3 extends Thread{
    public void run() {
        for (int i = 0; i<300; i++){
            System.out.print("-");
        }
        System.out.print("<<th1 종료>>");
    }
}
class ThreadEx4 extends Thread{
    public void run() {
        for (int i = 0; i<300; i++){
            System.out.print("|");
        }
        System.out.println("<<th2 종료>>");

    }
}

