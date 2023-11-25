package kr.ac.daegu.bsy;

class OracleConnector implements Connector{
    @Override
    public void connect(){
        System.out.println("Oracle 연결됨");
    }
}

class MySQLConnector implements Connector {
    @Override
    public void connect() {
        System.out.println("mySQL 연결됨");
    }
}

class ConnectorFactoty {

    public static Connector getConnector(String dbmsName){
        Connector connector = null;

        if (dbmsName.contentEquals("oracle")){
            connector = new OracleConnector();
        }
        else if(dbmsName.contentEquals("mysql")){
            connector = new MySQLConnector();
        }
        return connector;
    }



}

public class BusinessLogic {

    // 웹 어플리케이션이 비즈니스 로직(db의 데이터에 따라 처리를 달리 해야 하는 경우)를 수행하는 코드.
    public static void main(String[] args) {
        System.out.println("InterfacePractice2");
        // p.274 ~ p.275
        Connector oracleConnector = ConnectorFactoty.getConnector("oracle");
        oracleConnector.connect();

        Connector mySQLConnector = ConnectorFactoty.getConnector("mysql");
        mySQLConnector.connect();


        // 인터페이스 - 인터페이스를 (구체적으로 어떻게 돌아가는지) 구현객체 : 무조건 존재하게 되어 있음

        // static remind
        // 참조형 object(객체) = 런타임에서 쓸 수 있는 방법 2가지
        // - new 생성자 : 인스터스
        // - static 메소드, 멤버 변수, 인스턴스끼리 공유하는 자원

        //(디자인 패턴) : 팩토리패턴

    }
}