import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerTest {

    public static void main(String[] args){
        //Consumer<T>
        Consumer<String> c = name -> System.out.println(name + "hello!");
        c.accept("Ju yeon");

        //BoConsumer<T,U>
        BiConsumer<String, Integer> bc = (name,grade) ->
                System.out.println("name : " + name + "grade : " + grade);
        bc.accept("Ju yeon", 4);

        // IntConsumer
        IntConsumer ic = page ->
                System.out.println("open the bookpage "  + page);
        ic.accept(64);

        //ObjectIntConsumer<T>
        ObjIntConsumer<String> oic = (obj, price) ->
                System.out.println(obj + "는" + price + "원이다");
        oic.accept("사과", 4000);
    }
}
