package kr.ac.daegu.bsy;

public class ThisConstructorTest {

    public static void main(String[] args) {
        House house1 = new House();
        System.out.println(
                "house.price = " + house1.price
                + ", house.size = " + house1.size
                + ", house.dong = " + house1.dong
                + ", house.kind = " + house1.kind);

        House house2 = new House(300);
            System.out.println(
                "house.price = " + house2.price
                + ", house.size = " + house2.size
                + ", house.dong = " + house2.dong
                + ", house.kind = " + house2.kind);

        House house3 = new House(300,40);
        System.out.println(
                "house.price = " + house3.price
                        + ", house.size = " + house3.size
                        + ", house.dong = " + house3.dong
                        + ", house.kind = " + house3.kind);

        House house4 = new House(300,40,"서초동");
        System.out.println(
                "house.price = " + house4.price
                        + ", house.size = " + house4.size
                        + ", house.dong = " + house4.dong
                        + ", house.kind = " + house4.kind);

        House house5 = new House(300,40,"서초동","빌라");
        System.out.println(
                "house.price = " + house5.price
                        + ", house.size = " + house5.size
                        + ", house.dong = " + house5.dong
                        + ", house.kind = " + house5.kind);

}


}
