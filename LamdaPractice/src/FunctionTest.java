import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class FunctionTest {

    public static void main(String[] args){

        //Function<Integer,String>
        Function<Integer,String> integerToString = num -> {return Integer.toString(num);};
        String result1 = integerToString.apply(100);
        System.out.println("result1 = " + result1);

        //IntFunction<String>
        IntFunction<String> intToString = num -> {return Integer.toString(num);};
        String result2 = intToString.apply(100);
        System.out.println("result2 = " + result2);

        //ToIntFunction<String>
        ToIntFunction<String> strToInt = word -> {return Integer.parseInt(word);};
        int result3 = strToInt.applyAsInt("100");
        System.out.println("result3 = " + result3);

        //BiFunction<Integer,String,String>
        BiFunction<Integer,String,String> biFunction = (num, word) -> num + word;
        String result4 = biFunction.apply(100,"점");
        System.out.println("result4 = " + result4);
    }
}
