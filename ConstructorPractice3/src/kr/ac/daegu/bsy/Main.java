package kr.ac.daegu.bsy;

public class Main {

    public static void main(String[] args) {
        System.out.println("ConstructorPractice3");
        // p.205 ~ p.206
        Member member1 = new Member("baek",182,81,"kore");
        System.out.println(member1.getName());
        System.out.println(member1.getHeight());
        System.out.println(member1.getWeight());
        System.out.println(member1.getNation());
        //member1.name // 사용불가(private) <- 갖다쓰는 사람의 실수를 방지하기 위해(데이터의 무결성을 지키기위해)
    }
}
