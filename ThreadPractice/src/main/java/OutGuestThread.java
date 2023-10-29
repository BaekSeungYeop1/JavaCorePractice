import javax.swing.table.TableRowSorter;

public class OutGuestThread extends Thread{

    InOutProcess ip;
    public OutGuestThread(InOutProcess ip){
        this.ip = ip;
    }

    @Override
    public void run(){
        for (int i = 1; i< 10; i++){
            ip.outGuest();
            try {
                Thread.sleep((long) (Math.random()*500));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
