import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MappingTest {
    List<String> programList = Arrays.asList("Java", "Java Framework", "Spring FrameWork","jQuery");
    void printStreamData(){
        Stream<Integer> stream1 = programList.stream().map(String::length);
        stream1.forEach(System.out::println);
    }

    public static void main(String[] args) {
        MappingTest ft = new MappingTest();
        ft.printStreamData();
    }

}
