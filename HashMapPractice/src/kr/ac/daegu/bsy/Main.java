package kr.ac.daegu.bsy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // HashMap practice(자바 컬렉션 플레임워크의 일종)

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"사과"); // 1은 int(기본형)데이터인데 Integer라는 참조형 객체에 자동으로 들어가게 되는걸 알 수 있다. : 이걸 autoBoxing 이라고 한다.
        map.put(2,"자두"); // 모든 java의 기본형 데이터에는 wrapper class(Integer, Double, Short, Float)라는것이 있다.
        map.put(3,"수박");

        System.out.println(map);
        System.out.println(map.get(1)); // key의 값을 기준으로 데이터(value)를 찾는다.
        System.out.println("=============================================");
        //entrySet() 활용
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
        }
        System.out.println("=============================================");

        //KeySet() 활용
        for(Integer i : map.keySet()){ //저장된 key값 확인
            System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
        }
        System.out.println("=============================================");

        //keySet().iterator()
        Iterator<Integer> keys = map.keySet().iterator(); // Iterator : 순서가 없는 자료구조의 list화를 시킬때 쓴다. (순서가 없는 자료구조 : Map, Set), (순서(index번호)가 있는 자료구조 : List-ArrayList, LinkedList)
        while(keys.hasNext()){
            int key = keys.next();
            System.out.println("[Key]:" + key + " [Value]:" +  map.get(key));
        }

        // Map, Set의 가장 큰 차이점은 : Map (데이터의 중복을 허용한다.), Set (공통된 데이터만 보여준다.)


    }
}
