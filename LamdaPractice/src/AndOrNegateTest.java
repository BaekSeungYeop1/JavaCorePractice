import java.util.function.BiPredicate;

public class AndOrNegateTest {
    public static void main(String[] args){

        BiPredicate<String,String> bp1 = (str1, str2) -> {return str1.equals(str2);};
        BiPredicate<String,String> bp2 = (str1, str2) -> {return str1.equalsIgnoreCase(str2);};

        BiPredicate<String,String> bp3 = bp1.negate();
        boolean result1 = bp3.test("java", "Java");
        System.out.println("result1 = " + result1);

        BiPredicate<String,String> bp4 = bp1.and(bp2);
        boolean result2 = bp4.test("java", "Java");
        System.out.println("result2 = " + result2);

        BiPredicate<String,String> bp5 = bp1.or(bp2);
        boolean result3 = bp5.test("java","Java");
        System.out.println("result3 = " + result3);


    }
}
