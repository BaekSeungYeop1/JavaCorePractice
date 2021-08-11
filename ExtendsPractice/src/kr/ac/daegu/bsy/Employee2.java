package kr.ac.daegu.bsy;

class Employee2 {
    String name;
    String dept;
    int salary;

    public Employee2(String name, String dept, int salary) {
        super();
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    String getEmpolyeeInfo(){
        return "이름 : " + name + ", 부서 : " + dept + ", 연봉 : " + salary;
    }
}
