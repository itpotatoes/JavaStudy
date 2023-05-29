package week13.no4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;

public class GameFrame extends JFrame {

    JFrame frame;
    JPanel panel1;
    JPanel panel2;

    public GameFrame(){
        setSize(500,500);
        setTitle("8-퍼즐");
        setLayout(new BorderLayout());

        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.setLayout(new GridLayout(0,3));


        List<Integer> arr = java.util.Arrays.asList(0,1,2,3,4,5,6,7,8);
        Collections.shuffle(arr);


        JButton[][] buttons = new JButton[3][3];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(arr.get(index) == 0){
                    buttons[i][j] = new JButton(" ");
                }else{
                    buttons[i][j] = new JButton(arr.get(index).toString());
                }
                panel1.add(buttons[i][j]);
                index++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 int fi = i;
                 int fj = j;
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        int emptyRow = -1;
                        int emptyCol = -1;

                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                if (buttons[a][b].getText().equals(" ")) {
                                    emptyRow = a;
                                    emptyCol = b;
                                    break;
                                }
                            }
                            if (emptyRow != -1) break;
                        }

                        if (emptyRow != -1 && emptyCol != -1) {
                            if ((Math.abs(emptyRow - fi) == 1 && emptyCol == fj) || (Math.abs(emptyCol - fj) == 1 && emptyRow == fi)) {
                                String temp = buttons[fi][fj].getText();
                                buttons[fi][fj].setText(buttons[emptyRow][emptyCol].getText());
                                buttons[emptyRow][emptyCol].setText(temp);
                            }
                        }
                    }
                });
            }
        }



        add(panel1,"Center");
        panel2.add(new JButton("Reset"));
        add(panel2,"South");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    class bce implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String buttonText = button.getText();




        }
    }

    public static void main(String[] args) {
        GameFrame gf = new GameFrame();
    }
}
