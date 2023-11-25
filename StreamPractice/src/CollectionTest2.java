import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionTest2 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("aa","bb","cc");
        Stream<String> stream1 = list.stream();
        stream1.forEach(System.out::println);
    }
}
