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
            fo = new FileOutputStream("dataFile.txt");
            fi = new FileInputStream("dataFile.txt");
            dos = new DataOutputStream(fo);
            dis = new DataInputStream(fi);

            dos.writeShort(-1);
            dos.writeByte(2);
            dos.writeDouble(3.14);
            dos.writeLong(30);
            dos.writeUTF("datastream test");

            System.out.println(dis.readUnsignedShort());
            dis.skip(1);
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
            catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}

