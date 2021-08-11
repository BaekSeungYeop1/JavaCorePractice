package kr.ac.daegu.bsy;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        System.out.println("DateTimePractice");
        // 현재 날짜 출력
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        // 날짜를 직접 지정해서 출력
        LocalDate targetDate = LocalDate.of(2021,8,11);
        System.out.println(targetDate);

        // 현재 시간 출력
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        // 시간을 직접 지정해서 출력력
       LocalDateTime targetDateTime = LocalDateTime.of(2021, 8, 11, 5, 30,32,3333);
        System.out.println(targetDateTime);

        // 날짜 더하기기
       LocalDateTime currentDateTime2 = LocalDateTime.now();
        // 더 하기는 plus***() 빼기는 minus***()
        // currentDateTime.plusYears(long) or minusYears(long)
        LocalDateTime localDateTime = currentDateTime2.plusDays(2);
        System.out.println(localDateTime);
    }
}
