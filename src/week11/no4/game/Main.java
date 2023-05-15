package week11.no4.game;


//20190647 이용준

public class Main {
    public static void main(String[] args) {
        Dice user = new Dice();
        Dice com = new Dice();

        //User 주사위
        user.setValue(user.roll());
        //컴퓨터 주사위
        com.setValue(user.roll());

        
        //주사위 상태 출력
        System.out.println("유저 " + user.toString());
        System.out.println("컴퓨터 "+ com.toString());


        if(user.getValue()<com.getValue()){
            System.out.println("컴퓨터가 이겼습니다.");
        }else{
            System.out.println("유저가 이겼습니다.");
        }
    }
}
