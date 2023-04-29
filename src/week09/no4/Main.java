package week09.no4;


//20190647 이용준
public class Main {

    public static void main(String[] args) {
        ColorRectangle obj = new ColorRectangle(100,100,"blue");

        System.out.println("가로:" + obj.width);
        System.out.println("세로:" + obj.height);
        System.out.println("색상:"+ obj.color);

    }
}
