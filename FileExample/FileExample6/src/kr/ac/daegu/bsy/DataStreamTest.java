package kr.ac.daegu.bsy;

import java.io.*;

public class DataStreamTest {

    public static void main(String[] args) {
        System.out.println("FileExample6");
        // p.490 ~ p.491
        FileOutputStream fo = null;
        FileInputStream fi = null;
        DataOutputStream dos = null;
        DataInputStream dis = null;

        try{
            // INPUT
            // OUTPUT

            // 파일이 가지고 있는 컨텐츠 : 글, 사진, 영상, 이 컨텐츠들은 사실 byte[] 배열의 모음
            fo = new FileOutputStream("C:\\Users\\baek\\IdeaProjects\\JavaCorePractice\\FileExample6\\dataFile.txt");

            dos = new DataOutputStream(fo);  // java -> file (OUTPUT)
            dos.writeShort(-1);             // short : 2byte 자료형
            dos.writeByte(2);
            dos.writeByte(3);            // 16진수
            dos.writeByte(4);
            dos.writeDouble(3.14);
            dos.writeLong(30);
            dos.writeUTF("datastream test");


            fi = new FileInputStream("C:\\Users\\baek\\IdeaProjects\\JavaCorePractice\\FileExample6\\dataFile.txt");
            dis = new DataInputStream(fi);  // file <- java (INPUT)

            System.out.println(dis.readUnsignedShort());  // 65535 : unsigned(음수없음), short(2byte, 2^16)
            System.out.println(dis.readByte()); // readByte() : 역할이 뭔지? Byte - 파일이 가지고 있는 컨텐츠의 최소단위인데, 이 최소단위 '한개'를 읽어 온다.
            dis.skip(1);                    // skip : 파일 데이터 Stream의 바이트 n개를 건너 뛴다.
            System.out.println(dis.readByte());
            System.out.println(dis.readDouble());
            System.out.println(dis.readLong());
            System.out.println(dis.readUTF());
        }
        catch (IOException io){
            io.printStackTrace();
        }
        finally {
            try {
                fi.close();
                fo.close();
                dis.close();
                dos.close();
            }
            catch (IOException io) {
                io.printStackTrace();
            }

        }


    }
}

