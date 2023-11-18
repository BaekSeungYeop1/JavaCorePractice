package kr.ac.daegu.bsy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest {

    /*
     * ArrayList 테스트
     */

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        ArrayList arr2 = new ArrayList();

        arr2.add(10);
        arr2.add("10");

        array.add("korea");
        array.add("japan");
        array.add("america");
        array.add("brittain");
        System.out.println(Arrays.toString(arr2.toArray()));

        System.out.println("ArrayList에 요소 추가하고 출력");
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println();

        array.remove(0);
        array.remove("japan");

        System.out.println("ArrayList에서 요소 제거 후 출력");
        for (String s : array) {
            System.out.println(s);
        }


    }
}