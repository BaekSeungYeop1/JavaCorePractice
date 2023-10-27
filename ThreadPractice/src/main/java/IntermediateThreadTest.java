public class IntermediateThreadTest {
    public static void main(String[] args) {
        ThreadEx1 t1= new ThreadEx1();

        Runnable r = new ThreadEx2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}

class ThreadEx1 extends Thread{ // 1.Thread클래스를 상속받아 쓰레드 구현
    public void run(){
        for (int i = 0; i<500; i++){
            System.out.println(this.getName());
        }
    }
}
class ThreadEx2 implements Runnable{ // 2. Runnable  인터페이스를 구현해서 쓰레드 구현

    @Override
    public void run() {
        for (int i = 0; i<500; i++){
            // Thread.currentThread( - 현재 실행중인 Thread 반환
            System.out.println(Thread.currentThread().getName());
        }
    }
}