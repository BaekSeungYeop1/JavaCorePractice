public class DemonThread implements Runnable{
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new DemonThread());
        t.setDaemon(true); // 이분이 없으면 종료되지 않는다
        t.start();

        for (int i = 1; i<=10; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.println(i);
            if (i==5) autoSave = true;
        }
    }

    public void run(){
        while (true){
            try {
                Thread.sleep(3*1000);
            }catch (InterruptedException e){}

            if (autoSave) autoSave();
        }
    }
    public void autoSave(){
        System.out.println("작업 파일이 저장되었습니다");
    }
}
