package week13.no2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame {

    JFrame frame;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;

    JButton ngame;
    JButton endgame;

    JTextField input;
    JLabel result;

    int randnum;

    public GameFrame(){

        this.randnum = (int)(Math.random()*100)+1;

        setSize(500,150);
        setTitle("숫자게임");
        setLayout(new FlowLayout());
        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        ngame = new JButton("정답");
        input = new JTextField(30);


        panel1.add(new JLabel("숫자를 추측하시오 : "));
        System.out.println(randnum);
        ngame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(randnum == Integer.parseInt(input.getText())){
                    result.setText("정답입니다.");
                    result.setBackground(Color.BLUE);
                    ngame.setText("새 게임");
                }else if (randnum < Integer.parseInt(input.getText())){
                    result.setText("너무 높습니다.");
                    result.setBackground(Color.RED);
                    ngame.setText("새 게임");
                }else if(randnum > Integer.parseInt(input.getText())){
                    result.setText("너무 낮습니다.");
                    result.setBackground(Color.RED);
                    ngame.setText("새 게임");
                }
            }
        });
        endgame = new JButton("종료");
        result = new JLabel(" ");
        result.setOpaque(true);


        panel1.add(input);
        panel2.add(result);
        panel3.add(ngame);
        panel3.add(endgame);
        add(panel1);
        add(panel2);
        add(panel3);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
