import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntergerTest {
    public static void main(String[] args) {
        // 임의의 수
        IntStream intStream2 = new Random().ints(); // 무한 스트림
        IntStream intStream3 = new Random().ints(5,10);
        IntStream intStream4 = new Random().ints(10,5,10);

        //intStream2.limit(5).forEach(System.out::println);
        //intStream3.limit(10).forEach(System.out::println);
        //intStream4.forEach(System.out::println);

        // 람다식 iterate(), generate()

        // iterate(T seed, UnaryOperator f) 단항 연산자
        Stream<Integer> intStream = Stream.iterate(1, n-> n+2);
        intStream.limit(10).forEach(System.out::println);
        // generate(Supplier s) : 주기만 하는것 입력x, 출력o
        Stream<Integer> oneStream = Stream.generate(() -> 1);
        oneStream.limit(10).forEach(System.out::println);
    }
}
