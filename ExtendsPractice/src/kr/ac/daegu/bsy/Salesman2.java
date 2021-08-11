package kr.ac.daegu.bsy;

class Salesman2 extends Employee2{
    int commission;

    public Salesman2(String name, String dept, int salary, int commission) {
        //super()
        super(name, dept, salary);
        this.commission = commission;
    }

    /*String getEmployeeInfo(){
        return "이름 : " + name + ", 부서 : " + dept + ", 연봉 : " + salary + ", 수당 : " + commission;
    }*/
    String getEmployeeInfo(){
        return super.getEmpolyeeInfo() + ", 수당 = " + commission;
    }
}
