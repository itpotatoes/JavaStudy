package week12.no7;
import javax.swing.*;
import java.awt.*;
//20190647 이용준
public class RGBFrame extends JFrame {

    public RGBFrame(){
        setSize(300,500);
        setTitle("My Frame");
        setLayout(new GridLayout(0,4));

        for (int i = 0; i < 20; i++) {

            int r = (int)(Math.random()*256);
            int g = (int)(Math.random()*256);
            int b = (int)(Math.random()*256);

            Color color = new Color(r,g,b);
            JButton button = new JButton(String.valueOf(i));
            button.setBackground(color);
            add(button);
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
