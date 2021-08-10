package kr.ac.daegu.bsy;

public class AirConUse2 {
    public  static void main(String[] args){
        AirCon airCon1 = new AirCon();

        //변수 사용
        //변수 사용
        airCon1.color = "White";
        airCon1.temp = 10;
        airCon1.price = 10000;

        //메소드 사용
        airCon1.upTemp();
        System.out.println("airCon.temp = " + airCon1.temp + ", airCon.Color = " +airCon1.color + ", airCon.price = " + airCon1.price + "원");
        airCon1.onPower();
        airCon1.offPower();
        airCon1.downTemp();
        System.out.println("airCon.temp = " +airCon1.temp + ", airCon.color = " + airCon1.color + ", airCon.price = " + airCon1.price + "원");

        //두 번째 객체 생성
        AirCon airCon2 = new AirCon();
        System.out.println("airCon2.temp = " + airCon2.temp + ", airCon2.color = " + airCon2.color + ", airCon2.price = " + airCon2.price + "원");

        //airCon2 변수에 airCon1 변수 참조 값 할당
        airCon2 = airCon1;
        System.out.println("airCon2.temp = " + airCon2.temp + ", airCon2.color = " + airCon2.color + ", airCon2.price = " + airCon2.price + "원");
    }
}
