package kr.ac.daegu.bsy.bank;

public interface Bank {
    // 어떤 은행이던 은행이 가진 공통적인 기능
    void deposit(int money); // 입금
    void withdraw(int money); // 출금
}
