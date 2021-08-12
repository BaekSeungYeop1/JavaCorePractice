package kr.ac.daegu.bsy;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

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
        File file = new File("C:\\");  // C: 드라이브 경로를 이용해서 파일 객체를 생성(자바에서 파일의 경로를 지정할 때는 "\\"나 "/" 사용)
        String[] files = file.list();       //C:드라이브 안에 존재하는 모든 디렉터리와 파일 이름을 String[] 타입으로 얻어 오는 부분

        // 1. 부모 경로와 파일 이름을 이용해서 자식 파일 객체들을 생성
        // 2. 생성한 파일 객체가 디렉터리일 경우 정보를 출력
        // 3. 생성한 파일 객체가 파일일 경우 정보를 출력
        for (String fileName : files){
            File subFile = new File(file,fileName);
            if (file.isDirectory()){
                System.out.println("디렉터리 이름 : " + fileName);
            }
            else {
                System.out.println("파일 이름 : " + fileName + ", 파일 크기 : " + subFile.length()+ "byte");
            }
        }

        System.out.println("c : 드라이브의 이미지 파일만 출력");
        String[] imageFiles = file.list(new ImageNameFilter()); // 확장자가 ".jpg"로 끝나는 파일 이름들만 String 타입으로 가져옴

        // 파일의 정보 출력
        for (String fileName : imageFiles){
            File subFile = new File(file,fileName);
            System.out.println("파일 이름 : " + fileName + ", 파일 크기 : " + subFile.length() + "byte" + ", 파일 경로 : " + subFile.getAbsolutePath());
        }

        File makeFile = new File("c:\\data\\testFile.txt"); // 생성할 파일 객체를 추성적으로 만드는 부분(추상적인 객체가 메모리상에 생성)

        // 물리적으로 파일을 생성하는 부분
        try {
            makeFile.createNewFile();
        }
        catch (IOException e){
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
