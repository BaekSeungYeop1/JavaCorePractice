package kr.ac.daegu.bsy;

public class Main {

    public static void main(String[] args) {
        System.out.println("AnnotaionPractice");
        AnnotationHandler handler = new AnnotationHandler();
        AnnotationExam01 exam01 = handler.getInstance(AnnotationExam01.class, InsertIntData.class)
                .map(o -> (AnnotationExam01)o)
                .orElse(new AnnotationExam01());

        AnnotationExam02 exam02 = handler.getInstance(AnnotationExam02.class, InsertStringData.class)
                .map(o -> (AnnotationExam02)o)
                .orElse(new AnnotationExam02()); // java 8의 stream api

        System.out.println("myAge = " + exam01.getMyAge());
        System.out.println("defaultAge = " + exam01.getDefaultAge());

        System.out.println("myData = " + exam02.getMyData());
        System.out.println("defaultData = " + exam02.getDefaultData());
    }
}
