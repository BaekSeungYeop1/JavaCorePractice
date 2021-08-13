package kr.ac.daegu.bsy;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamTest {

    /*
     * InputStream 테스트
     */
    // 예외처리 사용자나 개발자에게 문제가 일어났을 시 빠르게 파악하기위해 사용하는 용도

    public static void main(String[] args) {

        // p.478 ~ p.479
        // 예제의 의도? 파일의 컨텐츠를 어떻게 읽어 들여 출력 할까?
        System.out.println("FileExample2");
        FileInputStream fIn = null;

        try{
            // C, C++ : 메모리에 객체를 적재 명령을 하면, 런타임에서 해당 객체를 다 쓰고 난 뒤에 "해제"하는 코드를 넣어줘야 한다.
            // GARBEGE COLLECTOR (쓰레기 수집기) : New Instance(); 객체를 메모리에 적재하고 GC가 '알아서' 메모리에 해제한다.
            fIn = new FileInputStream("C:\\data\\test.txt"); // 메모리(RAM)의 자원을 고정해서 점유한다
        }
        catch (IOException io){
            io.printStackTrace();
        }
        int var_read = -1;

        try {
            while ((var_read = fIn.read()) != -1){
                System.out.print((char)var_read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally { // try 블록에서 exception이 발생이 되던 안되던 실행되는 블록
            try {
                fIn.close(); // 메모리에(RAM) 자원 반납
            }
            catch (IOException io){
                io.printStackTrace();
            }
        }
    }
}
