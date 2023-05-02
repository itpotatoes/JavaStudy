package week09.game;


//20190647 이용준
public class Player extends Sprite{
    int x=0;
    int y=0;
    //플레이어 위치 랜덤생성
    public Player(){
        x = (int)(Math.random()*16)+1;
        y = (int)(Math.random()*7)+1;
    }

    //플레이어 위치 이동
    void move(char c){

        //임시 좌표 저장
        int new_x = x;
        int new_y = y;


        // 새로운 좌표로 이동
        if(c == 'h') --new_x;
        else if( c=='j') --new_y;
        else if( c == 'k') ++new_y;
        else if(c == 'l') ++new_x;

        //새로운 좌표가 만약 벽일경우 다시 원래자리로 돌아감
        if(new_y == 0 || new_y == 9 || new_x == 0 || new_x == 18){
            System.out.println("플레이어 못지나감");
        }else{
            x = new_x;
            y = new_y;
        }
    }

}
