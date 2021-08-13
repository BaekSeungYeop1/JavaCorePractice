package kr.ac.daegu.bsy;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest1 {

    // 확장자가 ".jpg"로 끝나는 파일 이름을 필터링해주는 클래스
    public static class ImageNameFilter implements FilenameFilter{
        @Override
        public boolean accept(File dir, String name){
            return name.endsWith(".jpg");
        }
    }
    /*
     * File 클래스 메소드 사용하기
     */

    public static void main(String[] args) {
        System.out.println("FileExample");
        // p.471 ~ p.473
        System.out.println("c: 드라이브의 전체 파일 출력");
        File file = new File("C:\\");  // C: 드라이브 경로를 이용해서 파일 객체를 생성(자바에서 파일의 경로를 지정할 때는 "\\"나 "/" 사용)  // pathname에 위치한 파일/디렉토리의 정보(디렉터리인지? 파일이름들...)을 모두 가져옴

        String[] files = file.list();       //C:드라이브 안에 존재하는 모든 디렉터리와 파일 이름을 String[] 타입으로 얻어 오는 부분

        // 1. 부모 경로와 파일 이름을 이용해서 자식 파일 객체들을 생성
        // 2. 생성한 파일 객체가 디렉터리일 경우 정보를 출력
        // 3. 생성한 파일 객체가 파일일 경우 정보를 출력
        for (String fileName : files){
            File subFile = new File(file,fileName);  // pathname(file)에 속한 파일 이름 (fileName)를 생성자 파라미터로 제공하여 한개의 파일 객체를 메모리에 적재한다
            if (subFile.isDirectory()){
                System.out.println("디렉터리 이름 : " + fileName);
            }
            else {
                System.out.println("파일 이름 : " + fileName + ", 파일 크기 : " + subFile.length()+ "byte");
            }
        }

        System.out.println("c : 드라이브의 이미지 파일만 출력");
        String[] imageFiles = file.list(new ImageNameFilter()); // 확장자가 ".jpg"로 끝나는 파일 이름들만 String 타입으로 가져옴

        // 파일의 정보 출력
        // getAsoultePath() : 절대 경로 C://sadasd/asdasfas/asddasd/sadasdsa/asdadssad.jpg
        // 상대경로 : 경로 자체를 호출하는 파일의 위치를 기준으로 쓰는 경로 (.././)
        for (String fileName : imageFiles){
            File subFile = new File(file,fileName);
            System.out.println("파일 이름 : " + fileName + ", 파일 크기 : " + subFile.length() + "byte" + ", 파일 경로 : " + subFile.getAbsolutePath());
        }

        File makeFile = new File("c:\\data\\testFile.txt"); // 생성할 파일 객체를 추성적으로 만드는 부분(추상적인 객체가 메모리상에 생성)

        // 물리적으로 파일을 생성하는 부분
        try {
            makeFile.createNewFile();  // java 언어에서는 일부 객체의 메소드에 한해 강제적인 예외처리를 요구한다.(파일접근, DB관련, ...) - java 시스템 바깥의 어떤 시스템에 접근해서 뭔가를 하고 싶을때
        }
        catch (IOException e){ // 파일처리의 경우 담당하는 예외
            e.printStackTrace();
        }

        //파일이 정상적으로 생성되었으면 메세지를 출력
        if (makeFile.exists()){
            System.out.println("makeFile이 생성됨");
        }
        File renameFile = new File ("c:\\data\\testFile2.txt"); // 추상적인 파일 객체를 하나 더 생성
        makeFile.renameTo(renameFile);                                   // 파일의 이름을 파라미터로 지정된 파일의 이름을 변경하는 부분
        //파일 이름이 정상적으로 변경되었으면 메세지를 출력
        if (renameFile.exists()){
            System.out.println("makeFile의 이름이 변경됨");
        }
        //해당 파일을 제거하는 작업 후 파일이 제대로 제거되었으면 메세지를 출력
        if (renameFile.delete()){
            System.out.println("renameFile이 제거됨");
        }
    }
}
