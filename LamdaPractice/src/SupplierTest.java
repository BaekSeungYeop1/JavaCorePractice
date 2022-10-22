import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args){

        //Supplier<String>
        Supplier<String> s = () ->
                "Supplier 인터페이스는 리턴 값만 있다";
        String result1 = s.get();
        System.out.println("result1 = " + result1);

        //IntSuppiler
        IntSupplier is = () -> 100;
        int result2 = is.getAsInt();
        System.out.println("result2 = " + result2);

        //DoubleSupplier
        DoubleSupplier ds = () -> 3.14;
        double result3 = ds.getAsDouble();
        System.out.println("result3 = " + result3);

        //BooleanSuppiler
        BooleanSupplier bs = () -> 1>2;
        boolean result4 = bs.getAsBoolean();
        System.out.println("result4 = " + result4);

    }
}
