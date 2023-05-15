package week11.no5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //발생횟수 저장 배열
        int[] cnt = new int[26];


        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. :");
        String input = sc.nextLine();

        input = input.toUpperCase();


        for (char c : input.toCharArray()) {
            try {
                cnt[c - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException 발생!!");
            }
        }

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > 0) {
                System.out.println((char) (i + 'A') + ": " + cnt[i]);
            }

        }
    }
}
