package week12.no5;

import javax.swing.*;
import java.awt.*;



// 20190647 이용준
public class BMIFrame extends JFrame {
    private JPanel panel;
    private JPanel panel2;
    private JPanel panel3;
    public BMIFrame(){

        setSize(300, 200);
        setTitle("BMI 계산기");

        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        setLayout(new FlowLayout());

        panel.add(new JLabel("나의 BMI 지수는 얼마나 될까?"));
        add(panel);
        panel2.add(new JLabel("나의 체중(kg)"));
        panel2.add(new JTextField(15));
        add(panel2);
        panel3.add(new JLabel("나의 키(m)"));
        panel3.add(new JTextField(15));
        add(panel3);

        JButton button = new JButton("BMI 확인하기");
        add(button);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
