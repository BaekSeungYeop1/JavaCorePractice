import java.util.stream.Stream;

public class GenerateStreamTest {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.generate(() -> "생성요소").limit(5);
        stream1.forEach(System.out::println);
    }
}
