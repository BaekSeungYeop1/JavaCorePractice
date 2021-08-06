package kr.ac.daegu.bsy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Collection (List : ArrayList)

        System.out.println("배열의 경우");
        //배열의 경우
        String[] strs5 = {"1", "2", "3", "4", "5",}; // 배열의 길이는 5
        // strs에 있는 데이터를 모두 출력하시오
        for (String s : strs5) {
            System.out.println(s);
        }

        //배열의 길이
        System.out.println("str5의 길이: " + strs5.length);

        // strs5에 "6"을 추가하시오 : java에서 배열은 초기 선언시 배열의 길이를 선언 해야한다.
        // 길이가 6인 strs6 배열을 추가하고
        // strs5의 내용을 strs6에 복사하고
        // 이걸 좀더 쉽게 할수 없을까?

        System.out.println("==============================");
        System.out.println("ArrayList의 경우");

        List<String> strs6 = new ArrayList<String>(); // strList의 배열의 길이를 선언시에 지정할 필요가 없고, 데이터가 추가, 삭제 될때마다 길이가 동적으로 변화한다.
        strs6.add("1"); // index 0
        strs6.add("2"); // index 1
        strs6.add("3"); // index 2
        strs6.add("4"); // index 3
        strs6.add("5"); // index 4

        // list의 길이
        System.out.println("list의 길이(\"6추가전\"): " + strs6.size());

        // strList에 "6"을 추가하시오
        strs6.add("6");

        // list의 길이
        System.out.println("list의 길이(\"6추가 후\"): " + strs6.size());

        // strList 중에 "2"를 삭제하시오
        strs6.remove(1);
        System.out.println("\"2\" 삭제 후");
        // strList의 내용을 전부 출력하시오
        for(String s: strs6){
            System.out.println(s);
        }

        // strList에서 "4"인것의 인덱스 번호는 몇번일까?
        int indexOf4 = strs6.indexOf("4");
        System.out.println("strList에서 \"4\"인것의 인덱스 번호: " + indexOf4);

    }

}
