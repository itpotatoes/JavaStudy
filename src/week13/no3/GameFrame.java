package week13.no3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame {


    JFrame frame;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;

    JLabel label1;
    JLabel label2;

    JButton button1;
    JButton button2;
    JButton button3;


    JButton button4;
    JButton button5;
    JButton button6;

    public GameFrame(){

        setSize(950,200);
        setTitle("가위바위보");
        setLayout(new BorderLayout(10,10));

        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        label1 = new JLabel("가위 바위 보 게임");
        label1.setHorizontalAlignment(label1.CENTER);
        label1.setFont(new Font("Serif",Font.BOLD,11));
        label1.setFont((label1.getFont().deriveFont(30.0f)));




        button1 = new JButton("가위");
        button2 = new JButton("바위");
        button3 = new JButton("보");

        button1.setPreferredSize(new Dimension(100, 100));
        button2.setPreferredSize(new Dimension(100, 100));
        button3.setPreferredSize(new Dimension(100, 100));
        panel1.add(new JLabel("컴퓨터"));
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);



        label2 = new JLabel("VS");
        label2.setFont(new Font("Serif",Font.BOLD,11));
        label2.setFont((label1.getFont().deriveFont(30.0f)));
        label2.setHorizontalAlignment(label2.CENTER);
        panel2.add(label2);

        button4 = new JButton("가위");
        button5 = new JButton("바위");
        button6 = new JButton("보");
        button4.setPreferredSize(new Dimension(100, 100));
        button5.setPreferredSize(new Dimension(100, 100));
        button6.setPreferredSize(new Dimension(100, 100));

        button4.addActionListener(new GameResult());
        button5.addActionListener(new GameResult());
        button6.addActionListener(new GameResult());

        panel3.add(new JLabel("유저"));
        panel3.add(button4);
        panel3.add(button5);
        panel3.add(button6);


        add(label1,"North");
        add(panel1,"West");
        add(panel2,"Center");
        add(panel3,"East");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    class GameResult implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            button1.setBackground(null);
            button2.setBackground(null);
            button3.setBackground(null);
            button4.setBackground(null);
            button5.setBackground(null);
            button6.setBackground(null);


            int randnum = (int)(Math.random()*2)+1;
            int input;
            JButton button = (JButton) e.getSource();
            String buttonText = button.getText();
            if(buttonText.equals("보")){
                input=3;
            }else if(buttonText.equals("바위")){
                input=2;
            }else{
                input=1;
            }
            System.out.println(randnum);
            if(input == 1 && randnum == 2){
                button.setBackground(Color.RED);
                button2.setBackground(Color.BLUE);
                label1.setText("컴퓨터가 이겼습니다.");
            }else if(input == 1 && randnum == 3){
                button.setBackground(Color.BLUE);
                button3.setBackground(Color.RED);
                label1.setText("유저가 이겼습니다.");
            }else if(input == 2 && randnum == 1){
                button.setBackground(Color.BLUE);
                button1.setBackground(Color.RED);
                label1.setText("유저가 이겼습니다.");
            }else if(input == 2 && randnum == 3){
                button.setBackground(Color.RED);
                button3.setBackground(Color.BLUE);
                label1.setText("컴퓨터가 이겼습니다.");
            }else if(input == 3 && randnum == 1){
                button.setBackground(Color.RED);
                button1.setBackground(Color.BLUE);
                label1.setText("컴퓨터가 이겼습니다.");
            }else if(input == 3 && randnum == 2){
                button.setBackground(Color.BLUE);
                button2.setBackground(Color.RED);
                label1.setText("유저가 이겼습니다.");
            }else{
                label1.setText("비겼습니다.");
            }
        }
    }

    public static void main(String[] args) {
        GameFrame fr = new GameFrame();
    }
}
