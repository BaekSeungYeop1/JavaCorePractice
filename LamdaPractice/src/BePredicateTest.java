import java.util.function.BiPredicate;

public class BePredicateTest {

    public static void main(String[] args){

        BiPredicate<String, String> bp = (str1, str2) -> { return str1.equals(str2);};
        boolean result1 = bp.test("java", "Java");
        System.out.println("result1 = " + result1);
    }
}
