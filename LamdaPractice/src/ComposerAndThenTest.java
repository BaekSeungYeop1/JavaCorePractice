import java.util.function.IntUnaryOperator;

public class ComposerAndThenTest {
    public static void main(String args[]){
        IntUnaryOperator add = num -> num + 2;
        IntUnaryOperator multiply = num -> num * 2;

        //compose
        int result1 = add.compose((multiply)).applyAsInt(1);
        System.out.println("result1 = " + result1);

        //andThen
        int result2 = add.andThen(multiply).applyAsInt(1);
        System.out.println("result2 = " + result2);
    }
}
