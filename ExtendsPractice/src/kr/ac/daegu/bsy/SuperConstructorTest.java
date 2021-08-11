package kr.ac.daegu.bsy;

public class SuperConstructorTest {

    public static void main(String[] args) {
	    System.out.println("ExtendsPractice");
	    // p.219 ~ p.220
        Salesman2 sales2 = new Salesman2("백승엽","개발부",1000000000,70000000);
            System.out.println(sales2.getEmployeeInfo());
    }
}
