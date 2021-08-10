package kr.ac.daegu.bsy;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzStore();
        PizzaStore ChicagoStore = new ChicagoPizzaStore();
        Pizza nyStylePizza = nyStore.orderPizze("cheese");
        System.out.println(nyStylePizza.getName());
        System.out.println("-------------------------------------------------");
        Pizza chicagoStylePizza = chicagoStore.orderPizza("cheese");
        System.out.println(chicagoStylePizza.getName());
    }
}
