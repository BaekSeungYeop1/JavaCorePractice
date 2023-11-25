import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterTest {

    List<String> programList = Arrays.asList("Java", "Java Framework", "Spring FrameWork","jQuery");
    void printStreamData(){
        Stream<String> stream1 = programList.stream().filter(programList -> programList.startsWith("Java"));
        stream1.forEach(System.out::println);
    }

    public static void main(String[] args) {
        FilterTest ft = new FilterTest();
        ft.printStreamData();
    }
}
