package week09.no3;


// 20190647 이용준
public class Main {

    static Soccer game = new Soccer();

    public static void main(String[] args) {
        System.out.println("경기이름 : "+game.getName() );
        System.out.println("경기자수 : "+game.getPlayers());
    }
}