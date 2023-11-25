package kr.ac.daegu.bsy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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

            Scanner sc = new Scanner(System.in);
            String input = null;
            do {
                System.out.println("입력하시오.");
                input = sc.next();
                if(input.equals("end")){
                    System.exit(0); // "end" 입력 시 강제종료
                }
            } while(!input.equals("Q")); // "Q" 입력 받을 때 까지 계속 반복

            // 데이터가 버퍼 사이즈만큼 전부 채워 지길 기다렸다가 flush 하는 경우 (비움)
            buW.flush();
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
