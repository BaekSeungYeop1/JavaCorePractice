package kr.ac.daegu.bsy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamTest {

    public static void main(String[] args) {
        System.out.println("FileExample");
        // p.485 ~ p.486
        // java 코드에서 생성한 문자열 데이터를 FileOutputStream 이용하여 fileOutput.txt에 쓰기.
        FileOutputStream fo = null;
        String msg = "FileOutputStream Test 안녕하세요";
        byte[] byteArray = msg.getBytes(); // msg.getBytes(StandardCharsets.UTF_8)안전하게 UTF=8인코딩 지정하여 다국어(한글) 지정 할 수 있도록

        try{
            // 상대경로를 지정할때 어떻게 테스트 해가면서 쓸지? : ./ 찍어서 실제 동작이 어떻게 되는지 확인하고 작성.
            // apppend의 뜻. : 기존 컨텐츠에 ++.
            fo = new FileOutputStream("fileout.txt",true);
            fo.write(byteArray);
        }
        catch (IOException io){
            io.printStackTrace();
        }
        finally {
            {
                try {
                    fo.close();
                }
                catch (IOException io){
                    io.printStackTrace();
                }
            }

            // 번외 : StringBuilder (append에 대한 추가 설명)
            StringBuilder sb = new StringBuilder();
            sb.append("hihi");
            sb.append("방가방가");
            System.out.println(sb);
            String str = "hihi";
            str = str + "방가방가";
            System.out.println(str);
        }
    }
}
