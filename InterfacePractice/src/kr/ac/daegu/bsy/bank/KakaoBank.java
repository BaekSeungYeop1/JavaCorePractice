package kr.ac.daegu.bsy.bank;

public class KakaoBank implements Bank{
    @Override
    public void deposit(int money) {
        System.out.println("kakaobank로 " + money + "만큼 입금 되었습니다.");
    }

    @Override
    public void withdraw(int money) {
        System.out.println("kakaobank로 " + money + "만큼 입금 되었습니다.");
    }
}
