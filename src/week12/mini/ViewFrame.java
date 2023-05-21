package week12.mini;

import javax.swing.*;
import java.awt.*;
//20196047 이용준
public class ViewFrame extends JFrame {
    private JPanel p_image;
    private JLabel l_image;
    private JPanel p_button;
    public ViewFrame(){
        setSize(512,600);
        setLayout(new BorderLayout());
        p_image = new JPanel();
        l_image = new JLabel();
        p_button = new JPanel();

        ImageIcon icon = new ImageIcon("Lenna.png");
        l_image.setIcon(icon);
        p_image.add(l_image);

        p_button.add(new JButton("<<"));
        p_button.add(new JButton("<"));
        p_button.add(new JButton(">"));
        p_button.add(new JButton(">>"));

        add(l_image,"Center");
        add(p_button,"South");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
