package week11.minigame;

import java.util.Random;
import java.util.Scanner;

//20190647 이용준

public class Main {
    public static void main(String[] args) {


        String[] words = { "java","count","school","book","student","programmer"};
        int index;
        char input;
        boolean correct;
        String solution;
        StringBuffer answer;



        Scanner scanner = new Scanner(System.in);
        index = (new Random()).nextInt(words.length);

        while (true) {
            solution = words[index];
            answer = new StringBuffer(solution.length());
            for (int i = 0; i < solution.length(); i++) {
                answer.append('_');
            }

            int failCount = 0;
            while (failCount < 3) {
                System.out.println("현재의 상태: " + answer);

                input = Character.toLowerCase(scanner.next().charAt(0));
                System.out.println("입력한 문자: "+input);

                correct = false;

                for (int j = 0; j < solution.length(); j++) {
                    if (solution.charAt(j) == input && answer.charAt(j) == '_') {
                        answer.setCharAt(j,input);
                        correct = true;
                        System.out.println(answer);
                    }
                }
                if (correct) {
                    System.out.println("정답!");
                    if(solution.equals(answer.toString())){
                        System.out.println("승리!");
                        index = (new Random()).nextInt(words.length);
                        break;
                    }
                } else {
                    System.out.println("실패!");
                    failCount++;
                }

                if (failCount >= 3) {
                    System.out.println("죽었습니다. 정답은 " + solution + "입니다.");
                    System.exit(0);
                }
            }
        }
    }
}
