package week10.no6;


//20190647 이용준
public class Main {

    public static void main(String[] args) {
        Movable[] shape = new Movable[2];
        shape[0] = new Rectangle();
        shape[1] = new Circle();

        //1~10사이 랜덤숫자
        int x,y;
        x= (int)(Math.random() * 9)+1;
        y= (int)(Math.random() * 9)+1;
        shape[0].move(x,y);

        x= (int)(Math.random() * 9)+1;
        y= (int)(Math.random() * 9)+1;
        shape[1].move(x,y);

    }
}
