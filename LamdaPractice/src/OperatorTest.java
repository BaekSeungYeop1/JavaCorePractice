import java.util.function.IntBinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorTest {

    public static void main(String[] args){

        //UnaryOperator<String>
        UnaryOperator<String> uo = word -> {return "입력된 문자열 : " + word;};
        String result1 = uo.apply("java8");
        System.out.println("result1 = " + result1);

        //IntBinaryOperator
        IntBinaryOperator ibo = (number1,number2) -> {return number1 + number2;};
        int result2 = ibo.applyAsInt(10,20);
        System.out.println("result2 = " + result2);
    }
}
