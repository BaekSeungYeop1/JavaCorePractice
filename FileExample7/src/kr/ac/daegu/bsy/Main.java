package kr.ac.daegu.bsy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("FileExample7");
        // p.506 ~ p.507
        FileWriter fileW = null;
        BufferedWriter buW = null;
        try{
            fileW = new FileWriter("bufferWriter.txt");
            buW = new BufferedWriter(fileW,4);
            buW.write('A');
            buW.write('B');
            buW.write('C');
            buW.write('D');
            //buW
        }
        catch (IOException io){
            io.printStackTrace();
        }
        finally {
            try{
                buW.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
