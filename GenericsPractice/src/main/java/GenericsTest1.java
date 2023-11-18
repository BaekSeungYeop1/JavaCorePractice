

/*class Box{
    Object item;

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}*/
class Box1<T,P>{
    T item;
//    static P price; 에러
  /*  static int compare(T t1, T t2){

    }*/

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
public class GenericsTest1 {
    public static void main(String[] args) {
        Box1<String,Integer> b = new Box1<String,Integer>();
//        b.setItem(new Object());
        b.setItem("ABC");
        String item = b.getItem();
    }
}
