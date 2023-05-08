package week10.no6;

public class Rectangle implements Movable{
    int width, height;
    public void draw(){
        System.out.println("사격형 그리기 메소드");
    }
    public void move(int dx,int dy){
        System.out.println("사각형 위치 : "+dx+","+dy);
    }

}
