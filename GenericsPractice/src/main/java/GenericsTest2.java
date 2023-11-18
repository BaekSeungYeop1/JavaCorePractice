import java.util.ArrayList;
import java.util.Arrays;

class Product{}
class Tv extends Product{}
class Audio extends  Product{}

public class GenericsTest2 {
    public static void main(String[] args) {

        ArrayList<Product> productList = new ArrayList<>();
        ArrayList<Audio> list = new ArrayList<>();
//        list.add(new Tv());
        list.add(new Audio());
//        list.add(new Product());

        productList.add(new Product());
        productList.add(new Audio());
        productList.add(new Tv());

        list.get(0);
    }
}
