package kr.ac.daegu.bsy;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutStreamTest {

    public static void main(String[] args) {
        System.out.println("FileExample5");
        // p.487 ~ p.488
        String msg = "ByteArrayOuter test";
        ByteArrayOutputStream bao = null;

        try{
            bao = new ByteArrayOutputStream();
            bao.write(msg.getBytes());
            System.out.println("bao = " + bao);
        }
        catch (IOException io){
            io.printStackTrace();
        }
        finally {
            try {
                bao.close();
            }
            catch (IOException io){
                io.printStackTrace();
            }
        }
    }
}
