import java.util.ArrayList;

class Fruits implements Eatable{
    public String toString(){
        return "fruit";
    }
}
class Apple extends Fruits{
    public String toString(){
        return "Apple";
    }
}
class Grape extends Fruits{
    public String toString(){
        return "Grape";
    }
}
class Toy{
    public String toString(){
        return "Toy";
    }
}
interface Eatable{}
public class GenericsTest4 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Fruits> FruitsBox = new FruitBox<>();
//        FruitBox<Toy> ToyBox = new FruitBox<>(); // 에러

        Box<Toy> toyBox = new Box<>();


    }
}
class FruitBox<T extends Fruits & Eatable> extends Box<T>{
}
class Box<T>{
    ArrayList<T> list = new ArrayList<>();
    void add(T item) {list.add(item);}
    T get(int i) { return list.get(1);}
    int size(){return list.size();}
    public String toStringI(){
        return list.toString();
    }
}
