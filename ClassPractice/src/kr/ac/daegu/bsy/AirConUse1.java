package kr.ac.daegu.bsy;

public class AirConUse1 {
    public static void main(String[] args) {
        AirCon airCon = new AirCon();

        //변수(객체의 속성) 사용
        airCon.color = "White";
        airCon.temp = 10;
        airCon.price = 10000;

        //메소드(객체가 가진 기능) 사용
        airCon.upTemp();
        System.out.println("airCon.temp = " + airCon.temp + ", airCon.Color = " +airCon.color + ", airCon.price = " + airCon.price + "원");
        airCon.onPower();
        airCon.offPower();
        airCon.downTemp();
        System.out.println("airCon.temp = " +airCon.temp + ", airCon.color = " + airCon.color + ", airCon.price = " + airCon.price + "원");
        System.out.println("\n=====================\n"); // \n : Line Feed + Carriage Return (엔터)
    }
}
