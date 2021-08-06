package kr.ac.daegu.bsy.student;

public class HighSchoolStudent implements Student{
    private String name; // 이름
    private int score;   // 점수

    public HighSchoolStudent(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override // Override : 메소드 재정년
    public String toString() {
        return "HighSchoolStudent{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public void printStudentInfo() {
        String info = this.toString();
        System.out.println(info);
    }
}
