import java.util.function.Predicate;

public class IsEqualsTest {
    public static void main(String[] args){

        Predicate<String> predicateObj = Predicate.isEqual("java");
        boolean result1 = predicateObj.test("java");
        System.out.println("result = " + result1);
    }
}
