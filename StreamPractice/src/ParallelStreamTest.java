import java.util.ArrayList;
import java.util.stream.Stream;

class Cart{
    String name;
    int price;
    int qty;

    public Cart(String name, int price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
}
public class ParallelStreamTest {
    public static void main(String[] args) {
        ArrayList<Cart> cartList = new ArrayList<>();
        cartList.add(new Cart("아반떼",1000,2));
        cartList.add(new Cart("소나타",2000,1));
        cartList.add(new Cart("그랜져",3000,2));

        Stream<Cart> stream1 = cartList.parallelStream();
        stream1.map(cart -> "이름 : " + cart.name + ", 가격" + cart.price * 20).forEach(System.out::println);

    }

}
