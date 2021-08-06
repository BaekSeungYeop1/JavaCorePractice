package pizza;

public class BsyPizza implements PizzaBaker{
    private String bread;
    private String ingrediant;

    private BsyPizza() {}; // BsyPizza의 인스턴스 생성할 때 기본 생성자를 사용하지 못하도록 조치.
    // 사실 여기서는 작성할 필요 없다.
    // 왜냐면, 이미 bread, ingrediant 인자를 받는 생성자를 만들어 뒀기 때문에
    // 기본 생성자는 자동으로 비활성 처리된다.

    public BsyPizza(String bread, String ingrediant){
        this.bread = bread;
        this.ingrediant = ingrediant;
    }

    @Override
    public void baking() {
        System.out.println("BsyPizza를 굽습니다");
    }

    @Override
    public void addIngrediant() {
        System.out.println("재료를 BsyPizza로 넣습니다.");
    }

    @Override
    public void packing() {
        System.out.println("BsyPizza를 포장합니다.");
    }
}
