package week11.no2;

import java.util.Scanner;

//20190647 이용준
public class Main {


    public static void main(String[] args) {
        int result = 0;
        String[] num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextLine().split(" ");

        try{

            for(String s : num){
                result += Integer.parseInt(s);
            }
            System.out.println("정수들의 합은 "+result);
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException 발생!!");
        }
    }

}
