import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionTest {
    public static void main(String args[]){
        // 컬렉션
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> intStream = list.stream();
        //intStream.forEach(System.out::print);

        // stream은 1회용, stream에 대해 최종연산을 수행하면 stream이 닫힌다
        intStream = list.stream();
        intStream.forEach(System.out::print);

        // 배열
        String[] strArr = {"a","b","c"};
        Stream<String> strStream1 = Stream.of("a","b","c");
        Stream<String> strStream2 = Stream.of(new String[]{"A","B","C"});
        Stream<String> strStream3 = Stream.of(strArr);
        Stream<String> strStream4 = Arrays.stream(strArr);

        //strStream1.forEach(System.out::println);
        //strStream2.forEach(System.out::println);

        int[] intArr = {1,2,3,4,5};
        IntStream intStream1 = Arrays.stream(intArr);
        //System.out.println("count = " + intStream1.count());
        intStream1 = Arrays.stream(intArr);
        //System.out.println("sum = " + intStream1.sum());


    }
}
