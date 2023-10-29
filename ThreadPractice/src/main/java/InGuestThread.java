public class InGuestThread extends Thread{

    InOutProcess ip;

    public InGuestThread(InOutProcess ip){
        this.ip = ip;
    }

    @Override
    public void run(){
        for (int i = 1; i<10; i++){
            ip.inGuest();
            try {
                Thread.sleep((int) (Math.random()*500));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
