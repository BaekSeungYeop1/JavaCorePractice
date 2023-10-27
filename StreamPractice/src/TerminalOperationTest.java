
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperationTest {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lambda", "Stream",
                "count", "sum"
        };

        Stream.of(strArr).forEach(System.out::println);
        System.out.println();

        boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length()==0);
        // default 직렬 처리
        Optional<String> sWord = Stream.of(strArr)
                .filter(s->s.charAt(0)=='s').findFirst();
        // parallel 병렬 처리
        Optional<String> dWord = Stream.of(strArr)
                .parallel()
                .filter(s->s.charAt(0)=='s').findAny();

        System.out.println("noEmptyStr = " + noEmptyStr);
        System.out.println("sWord = " + sWord);
        System.out.println();

        // Stream<String[]>을 IntStream으로 변환
//        Stream<Integer> intStream1 = Stream.of(strArr).map(String::length);

        // Stream<String> IntStream으로 변환, IntStream 기본 스트림. (s) -> s.length()
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0,(a,b) -> a+1);
        int sum = intStream2.reduce(0, (a,b) -> a+b);

        OptionalInt max = intStream3.reduce(Integer::max);
        OptionalInt min = intStream4.reduce(Integer::min);

        System.out.println("min = " + min.getAsInt());
        System.out.println("max = " + max.getAsInt());
        System.out.println("count = " + count);
        System.out.println("sum = " + sum);
    }
}
