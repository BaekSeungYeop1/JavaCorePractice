import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStreamTest {
    public static void main(String[] args) {

        String[] arr1 = new String[]{"111","222","3333"};
        Stream<String> stream1 = Arrays.stream(arr1);
        stream1.forEach(System.out::println);
        System.out.println();
        System.out.println();
        Stream<String> stream2 = Arrays.stream(arr1,0,2);
        stream2.forEach(System.out::println);

    }
}
