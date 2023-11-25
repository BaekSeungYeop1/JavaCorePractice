import java.sql.SQLOutput;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveTypeStream {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.range(0,6);
        System.out.println("stream1");
        stream1.forEach(System.out::println);

        LongStream stream2 = LongStream.rangeClosed(0,6);
        System.out.println("stream2");
        stream2.forEach(System.out::println);

        Stream<Integer> stream3 = IntStream.range(1,5).boxed();
        System.out.println("stream3");
        stream3.forEach(System.out::println);

        DoubleStream stream4 = new Random().doubles(2);
        System.out.println("stream4");
        stream4.forEach(System.out::println);
    }
}
