package week11.no4.game;


//20190647 이용준

public class Dice {

    int num;

    public Dice(){
        num = 1;
    }

    int roll(){
      return (int)(Math.random()*5)+1;
    }

    void setValue(int v){
        num = v;
    }
    int getValue(){
        return num;
    }
    @Override
    public String toString(){
        return "현재 주사위 면은 "+num+"입니다.";
    }
}
