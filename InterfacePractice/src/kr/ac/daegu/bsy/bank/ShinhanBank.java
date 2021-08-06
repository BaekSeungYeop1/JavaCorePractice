package kr.ac.daegu.bsy.bank;

public class ShinhanBank implements Bank{
    @Override
    public void deposit(int money) {
        System.out.println("신한은행으로 입금 되었습니다." + money + " 원.");
    }

    @Override
    public void withdraw(int money) {
        System.out.println("신한은행으로 출금 되었습니다." + money + " 원.");
    }
}
