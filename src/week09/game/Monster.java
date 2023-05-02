package week09.game;


//20190647 이용준
public class Monster extends Sprite {
    int x; int y;
    
    //몬스터 위치 랜덤 생성
    public Monster(){
        x = (int)(Math.random()*16)+1;
        y = (int)(Math.random()*7)+1;
    }
    
    //몬스터 위치 랜덤 이동
    void move(char c){

        //몬스터 이전 좌표 저장
        int old_x=x;
        int old_y=y;

        //몬스터 위치 랜덤 이동
        x += (Math.random()-0.5)>0? 1: -1;
        y += (Math.random()-0.5)>0? 1: -1;

        
        //몬스터 위치가 벽일경우 원래 자리로 돌림
        if(y == 0 || y == 9 || x == 0 || x == 18){
            System.out.println("몬스터 못지나감");
            x = old_x;
            y = old_y;
        }
    }
}
