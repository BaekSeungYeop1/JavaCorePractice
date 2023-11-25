import java.io.File;
import java.util.stream.Stream;

public class  IntermediateOperationTest2 {
    public static void main(String[] args) {
        File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"), new File("Ex2.java"),
                new File("Ex1"),new File("Ex1.txt")
        };

        Stream<File> fileStream = Stream.of(fileArr);

        // map()으로
        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println);// 모든파일 이름 출력

        fileStream = Stream.of(fileArr);

        fileStream.map(File::getName)   //Stream<File> -> Stream<String>
                .filter(s -> s.indexOf('.') != -1)  // 확장자없는 것 제외
                .peek(s -> System.out.printf("filename=%s%n",s))
                .map(s -> s.substring(s.indexOf('.')+1)) // 확장자만 추출
                .peek(s -> System.out.printf("extension=%s%n",s))
                .map(String::toUpperCase) // 모두 대문자로 변환
                .distinct() // 중복 제거
                .forEach(System.out::println);
    }
}
