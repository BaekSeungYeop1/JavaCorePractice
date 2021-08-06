package kr.ac.daegu.bsy;

import kr.ac.daegu.bsy.student.ElementaryStudent;
import kr.ac.daegu.bsy.student.HighSchoolStudent;
import kr.ac.daegu.bsy.student.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        // interface란 뭔가? : 서로 다른 객체에 구현된 공통된 기능을 쓸 수 있도록 한다.

        List<String> arrayList = new ArrayList<String>();
        List<String> linkedList = new LinkedList<String>();

        // arrayList에 string 데이터를 넣는다.
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        // linkedList에 string 데이터를 넣는다.
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");

        System.out.println(arrayList);
        System.out.println(linkedList);

         */

        // interface란 뭔가? : 서로 다른 객체에 구현된 공통된 기능을 쓸 수 있도록 한다.
//        Bank kakaoBank = new KakaoBank(); // Bank라는 인터페이스를 구현한 객체여야 한다.
//        Bank shinhanBank = new ShinhanBank();
//        kakaoBank.deposit(10000);
//        kakaoBank.withdraw(10000);
//        System.out.println("=====");
//        shinhanBank.deposit(10000);
//        shinhanBank.withdraw(10000);

        // 왜쓰냐?
        List<Student> students = new ArrayList<>(); // 컬렉션프레임워크에서의 제네릭 : <TYPE> 과 관계있는 객체만 넣을 수 있다.
        students.add(new ElementaryStudent("초딩 이름1", "2학년"));
        students.add(new ElementaryStudent("초딩 이름2", "4학년"));
        students.add(new HighSchoolStudent("고딩 name1", 44));
        students.add(new HighSchoolStudent("고딩 name2", 77));
        // 학생들의 정보를 모두 보여주시오
        for(Student s : students){
            s.printStudentInfo();
        }

        System.out.println("===========");

        // 위 상황에서 인터페이스 안쓰고 똑같이 할려면
        List<ElementaryStudent> elementaryStudents = new ArrayList<>();
        elementaryStudents.add(new ElementaryStudent("초딩 이름1", "2학년"));
        elementaryStudents.add(new ElementaryStudent("초딩 이름2", "4학년"));
        List<HighSchoolStudent> highSchoolStudents = new ArrayList<>();
        highSchoolStudents.add(new HighSchoolStudent("고딩 name1", 44));
        highSchoolStudents.add(new HighSchoolStudent("고딩 name2", 77));
        for(ElementaryStudent es : elementaryStudents) {
            es.printStudentInfo();
        }
        for(HighSchoolStudent hs : highSchoolStudents) {
            hs.printStudentInfo();
        }


    }
}
