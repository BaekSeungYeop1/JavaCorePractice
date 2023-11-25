import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringTypeStream {
    public static void main(String[] args){
        IntStream stream1 = "Java Programming".chars();
        System.out.println("stream1");
        stream1.forEach(System.out::println);

        Stream<String> stream2 = Pattern.compile(",").splitAsStream("오정원,이정원,박정원");
        System.out.println("stream2");
        stream2.forEach(System.out::println);
    }
}
