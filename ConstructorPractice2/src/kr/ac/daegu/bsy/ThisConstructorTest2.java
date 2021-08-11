package kr.ac.daegu.bsy;

public class ThisConstructorTest2 {
    public static void main(String[] args){
        System.out.println("ConstructorPractice2");
        //p.201 ~ p.202
        House house1 = new House();
        printHouse(house1); // house의 멤버변수들 값을 출력하는 메소드

        House house2 = new House(300);
        printHouse(house1);

        House house3 = new House(300, 40);
        printHouse(house1);

        House house4 = new House(300,40,"서초동");
        printHouse(house1);

        House house5 = new House(300,40,"서초동","빌라");
        printHouse(house1);
    }

    private static void printHouse(House house) {
        System.out.println(house.toString());
    }
}
