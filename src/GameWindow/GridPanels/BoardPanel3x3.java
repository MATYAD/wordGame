package GameWindow.GridPanels;

import javax.swing.*;
import java.awt.*;

public class BoardPanel3x3 extends JPanel {
    JButton button1x1 = new JButton();
    JButton button1x2 = new JButton();
    JButton button1x3 = new JButton();
    JButton button2x1 = new JButton();
    JButton button2x2 = new JButton();
    JButton button2x3 = new JButton();
    JButton button3x1 = new JButton();
    JButton button3x2 = new JButton();
    JButton button3x3 = new JButton();
    public BoardPanel3x3() {
        this.setLayout(new GridLayout(3,3,5,5));

        button1x1.setText("1");
        this.add(button1x1);
        button1x2.setText("2");
        this.add(button1x2);
        button1x3.setText("3");
        this.add(button1x3);
        button2x1.setText("4");
        this.add(button2x1);
        button2x2.setText("5");
        this.add(button2x2);
        button2x3.setText("6");
        this.add(button2x3);
        button3x1.setText("7");
        this.add(button3x1);
        button3x2.setText("8");
        this.add(button3x2);
        button3x3.setText("9");
        this.add(button3x3);


        this.setVisible(true);

    }
}
