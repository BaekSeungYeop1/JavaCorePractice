package kr.ac.daegu.bsy;

public class Main {

    public static void main(String[] args) {
        // p.319 ExceptionTest3
        try{
            int num = Integer.parseInt(args[0]);
            int result = 10/num;
            System.out.println("result = " + result);
        }
        // 프로그램 실행 시에 인자를 입력하지 않고 실행했을 때 발생하는 예외를 처리해 주는 부분
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("인자를 하나 입력해주세요요.");
        }
        // 문자 타입의 인자 값을 전달했을 때 발생하는 예외를 처리하는 부분.
        catch(NumberFormatException e){
            System.out.println("인자를 정수 타입으로 입력해주세요");
        }
        catch (ArithmeticException e){
            System.out.println("정수를 0으로 나누면 안되요.");
        }
        System.out.println("프로그램 계속 실행됨.");
    }


}
