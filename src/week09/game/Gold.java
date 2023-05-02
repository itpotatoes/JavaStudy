package week09.game;

public class Gold {

    int x;
    int y;

    //골드 위치 랜덤 생성
    public Gold(){
        x = (int)(Math.random()*17)+1;
        y = (int)(Math.random()*8)+1;
    }
}
