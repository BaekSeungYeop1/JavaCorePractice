package kr.ac.daegu.bsy;

public class AirCon {
    // 변수 정의
    String company;
    String color;
    int price;
    int size;
    int temp;

    // 메소드 정의
    void onPower() {
        System.out.println("power on");
    }
    void offPower() {
        System.out.println("power off");
    }
    void upTemp() {
        temp++;
    }
    void downTemp() {
        temp--;
    }
}
