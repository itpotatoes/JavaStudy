package week09.game;


//20190647 이용준
public class Gold {

    int x;
    int y;

    //골드 위치 랜덤 생성
    public Gold(){
        x = (int)(Math.random()*16)+1;
        y = (int)(Math.random()*7)+1;
    }
}
