import java.util.ArrayList;
import java.util.Iterator;

class Student{
    String name = "";
    int ban;
    int no;

    public Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}
public class GenericsTest3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("김",1,1));
        list.add(new Student("이",1,2));
        list.add(new Student("박",2,1));

        Iterator<Student> it = list.iterator();

        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.name);
        }
    }
}
