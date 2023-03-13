import java.util.Comparator;
import java.util.stream.Stream;

public class IntermediateOperationTest1 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("김아무개",3, 300),
                new Student("박아무개",1, 700),
                new Student("백아무개",2, 200),
                new Student("유아무개",2, 150),
                new Student("석아무개",5, 1000),
                new Student("신아무개",4, 250)
        );

        //studentStream.sorted(Comparator.comparing(Student::getBan)
        studentStream.sorted(Comparator.comparing((Student s) -> s.getBan())
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

    }
}


class Student implements Comparable<Student>{
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore){
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

    String getName() {return name;}
    int getBan() { return ban;}
    int getTotalScore() { return totalScore;}

    public int compareTo(Student s){
        return s.totalScore -this.totalScore;
    }
}
