import javax.print.DocFlavor;

public class SynchronizedTest {
    public static void main(String[] args) {
        Runnable r = new RunnableEx();
        new Thread(r).start();
        new Thread(r).start();
    }
}
class Account{
    private int balance = 1000;
    public int getBalance(){
        return balance;
    }

    public synchronized void withDraw(int money){
        if (balance >= money){
            try {
                Thread.sleep(1000);
                balance -= money;
            }catch (InterruptedException e){}
        }
    }
}
class RunnableEx implements Runnable{

    Account acc = new Account();
    @Override
    public void run() {
        while (acc.getBalance() >0){
            int money = (int)(Math.random()*3+1)*100;
            acc.withDraw(money);
            System.out.println("acc.getBalance() = " + acc.getBalance());
        }
    }
}
