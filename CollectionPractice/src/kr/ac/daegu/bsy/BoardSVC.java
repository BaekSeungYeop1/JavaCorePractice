package kr.ac.daegu.bsy;
// 실질적인 비즈니스 로직이 구현되어있는 클래스
import java.util.ArrayList;

public class BoardSVC {
    ArrayList<BoardVo> boardList;

    public BoardSVC(){
        boardList = new ArrayList<BoardVo>() ;
    }

}
