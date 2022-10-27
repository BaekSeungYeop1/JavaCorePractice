import java.util.function.BinaryOperator;

class Student{
    String name;
    int number;

    public Student(String name, int number){
        super();
        this.name = name;
        this.number = number;
    }
}
public class MinByMaxByTest {
    public static void main(String[] args){
        Student student1 = new Student("오정원",10);
        Student student2 = new Student("이정원",20);

        BinaryOperator<Student> bo1 = BinaryOperator.minBy((st1,st2) -> Integer.compare(st1.number, st2.number));
        Student minStrudent = bo1.apply(student1,student2);
        System.out.println("minStudent = " + minStrudent.name);

        BinaryOperator<Student> bo2 = BinaryOperator.maxBy((st1,st2) -> Integer.compare(st1.number, st2.number));
        Student maxStrudent = bo2.apply(student1,student2);
        System.out.println("maxStudent = " + maxStrudent.name);

    }
}

