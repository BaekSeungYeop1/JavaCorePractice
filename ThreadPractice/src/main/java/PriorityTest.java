public class PriorityTest {
    public static void main(String[] args) {
        ImportantThread it = new ImportantThread("중요한 작업");
        NotImportantThread nit = new NotImportantThread("중요하지 않은 작업");

        /*
         * Thread.MAX_PRIORITY = 최대 우선순위 10
         * Thread.NORM_PRIORITY = 증긴 우선 순위 5
         * Thread.MIN_PRIORITY = 최소 우선 순위 1
         */
        it.setPriority(Thread.MAX_PRIORITY);
        nit.setPriority(Thread.MIN_PRIORITY);

        nit.start();
        it.start();
    }
}
class ImportantThread extends Thread{

    public ImportantThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0 ; i<15; i++){
            System.out.println(currentThread().getName());
        }
    }
}

class NotImportantThread extends Thread{

    public NotImportantThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0 ; i<15; i++){
            System.out.println(currentThread().getName());
        }
    }
}
