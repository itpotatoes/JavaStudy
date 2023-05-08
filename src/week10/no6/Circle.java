package week10.no6;

public class Circle implements Movable{
    int width, height;
    public void draw(){
        System.out.println("원 그리기 메소드");
    }
    public void move(int dx,int dy){
        System.out.println("원 위치 : "+dx+","+dy);
    }

}
