package week12.no9;

import javax.swing.*;
//20190647 이용준
public class RandomFrame extends JFrame {
    private JLabel label;
    public RandomFrame(){

        setLayout(null);
        setSize(500,500);
        setTitle("My Frame");

        for (int i = 0; i < 20; i++){
            label = new JLabel();
            int x = (int)(Math.random()*300);
            int y = (int)(Math.random()*300);
            int w = (int)(Math.random()*300);
            int h = (int)(Math.random()*300);
            label.setSize(5,5);
            label.setBounds(x,y,w,h);
            label.setText(String.valueOf(i));
            add(label);
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
