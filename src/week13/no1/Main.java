package week13.no1;

import javax.swing.*;
import java.awt.event.*;



//20190647 이용준
public class Main extends JFrame {
    int img_x=150, img_y=150;
    JButton button;
    boolean drag = false;

    public Main() {
        setSize(600,300);
        button = new JButton("");
        ImageIcon icon = new ImageIcon("d://car.png");

        button.setIcon(icon);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        button.setLocation(img_x,img_y);
        button.setSize(200,100);

        button.addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent e) {
                img_x = getMousePosition().x-100;
                img_y = getMousePosition().y-50;
                button.setLocation(img_x, img_y);
            }
            public void mouseMoved(MouseEvent e) {

            }
        });
        panel.add(button);
        panel.requestFocus();
        panel.setFocusable(true);
        panel.addKeyListener(new KeyListener(){
            public void keyPressed(KeyEvent e){
                int keycode = e.getKeyCode();
                switch (keycode){
                    case KeyEvent.VK_UP: img_y -= 10; break;
                    case KeyEvent.VK_DOWN: img_y += 10; break;
                    case KeyEvent.VK_LEFT: img_x -= 10; break;
                    case KeyEvent.VK_RIGHT: img_x += 10; break;
                }
                button.setLocation(img_x,img_y);
            }
            public void keyReleased(KeyEvent arg0){}
            public void keyTyped(KeyEvent arg0){}
        });
        panel.addMouseListener(new MouseListener() {
            public void mousePressed(MouseEvent e){
                System.out.println("버튼 " + button.getLocation());
                System.out.println("마우스 " + "x" + e.getX()+"y"+e.getY());
                img_x = e.getX();
                img_y = e.getY();
                button.setLocation(img_x,img_y);
            }
            public void mouseReleased(MouseEvent e){
            }
            public void mouseEntered(MouseEvent e){
            }
            public void mouseExited(MouseEvent e){
            }
            public void mouseClicked(MouseEvent e){
            }

        });
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Main f = new Main();
    }
}