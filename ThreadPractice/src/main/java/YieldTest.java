public class YieldTest {
    public static void main(String[] args) {

    }
}

class ThreadEx8 implements Runnable{
    boolean suspend = false;
    boolean stopped = false;

    Thread th;
    ThreadEx8(String name){
        th = new Thread(this, name);
    }

    @Override
    public void run() {
        while (!stopped){
            if (!suspend){

                try {
                    Thread.sleep(1);
                }catch (InterruptedException e){}
            }else {
                Thread.yield();
            }

        }
    }
}
