package week09.game;


import java.util.Scanner;

abstract class Sprite{
    int x=3, y=3;
    abstract void move(char c);

}
public class Main {

    //게임 영역
    static char[][] board = new char[10][19];
    //게임상태
    static boolean gameOver = false;
    static Scanner sc = new Scanner(System.in);
    static Player player = new Player();
    static Monster monster = new Monster();
    static Gold gold = new Gold();

    public static void main(String[] args) {



        //게임 화면 출력 ( 플레이어 / 몬스터 / 황금 )
        while(!gameOver){
            for(int i=0; i<10; i++){
                for(int j=0; j<19; j++){
                    //벽 출력
                    if(i == 0 || i == 9 || j == 0 || j == 18) {
                        System.out.print('#');
                    }
                    //플레이어 위치 출력
                    else if( j == player.x && i == player.y){
                        System.out.print('@');
                    //몬스터 위치 출력    
                    }else if( j == monster.x && i == monster.y) {
                        System.out.print('M');
                    //골드 위치 출력    
                    }else if(j == gold.x && i == gold.y){
                        System.out.print('G');
                    //빈공간 . 출력
                    }else{
                        System.out.print('.');
                    }
                }
                System.out.println();
            }

            //사용자에게 키 입력받기
            System.out.print("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽(l) : ");
            char input = sc.next().charAt(0);
            
            //플레이어 / 몬스터 이동
            player.move(input);
            monster.move(input);



            //몬스터와 황금과 곂칠경우 몬스터의 위치 재이동
            if(monster.x == gold.x && monster.y == gold.y){
                monster.move(input);
            }

            // 몬스터 충돌 및 황금획득시 게임오버 처리
            if(player.x == monster.x && player.y == monster.y){
                System.out.println("플레이어와 몬스터가 충돌하여 게임을 종료합니다.");
                gameOver = true;
            }else if(player.x == gold.x && player.y == gold.y){
                System.out.println("플레이어가 황금을 획득하였습니다. 게임을 종료합니다.");
                gameOver = true;
            }
        }
    }

}
