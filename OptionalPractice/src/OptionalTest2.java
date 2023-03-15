import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.OptionalInt;

public class OptionalTest2 {
    public static void main(String[] args) {
        OptionalInt opt = OptionalInt.of(0);    // 0저장 value = 0
        OptionalInt opt2 = OptionalInt.empty();       // 0저장 value = 0

        System.out.println(opt.isPresent());    // true
        System.out.println(opt2.isPresent());   // false
        System.out.println(opt.equals(opt2));   // false
        System.out.println();

        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);
//        Optional<Integer> optInt = optStr.map( s -> s.length());
        System.out.println("OptStr = " + optStr.get());
        System.out.println("optInt = " + optInt.get());

        int result1 = Optional.of("123")
                .filter(x->x.length() >0)
                .map(Integer::parseInt).get();

        int result2 = Optional.of("")
                .filter(x->x.length() >0)
                .map(Integer::parseInt).orElse(-1);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        // ifPresent 값이 null이면 에러 발생,
        Optional.of("456").map(Integer::parseInt)
                .ifPresent(x -> System.out.printf("result3=%d%n", x));




    }
}
