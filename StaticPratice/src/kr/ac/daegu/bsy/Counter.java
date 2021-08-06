package kr.ac.daegu.bsy;

public class Counter {
    static int count = 0; // 인스턴스끼리 공유가 된다
    int score = 99; //인스턴스 변수, 인스턴스(생성자)를 호출해야 쓸 수 있다
    Counter(){
        count++;
        System.out.println(count);
    }
    public static int getCount(){
//        score 33; // static 메소드에서 인스터스 변수를 쓸 수 없다/
        return count;
    }
    public int getScore(){
        count= 44; // 인스터스 메소드에서는 static 멤버볍수를 쓸수 있다.
        return score;
    }
    public  static  void main(String[] args){
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println(Counter.getCount());
    }
}
