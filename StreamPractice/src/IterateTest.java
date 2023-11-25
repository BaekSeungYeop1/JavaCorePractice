import java.util.stream.Stream;

public class IterateTest {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.iterate(10, n -> n*2).limit(5);
        stream1.forEach(System.out::println);
    }
}
