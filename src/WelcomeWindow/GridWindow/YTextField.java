package WelcomeWindow.GridWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class YTextField extends JTextField {
    char input;

    public YTextField() {
        this.setBounds(250,250,100,50);
        this.setText("0");
        this.setBorder(BorderFactory.createLineBorder(Color.ORANGE,3));
        this.setBackground(Color.BLACK);
        this.setFont(new Font("Didot", Font.BOLD, 30));
        this.setForeground(Color.ORANGE);
        this.setCaretColor(Color.WHITE);

        this.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                input = e.getKeyChar();
                if ((input < '0' || input > '9') && input != '\b') {
                    e.consume();

                }
            }
        });

    }


}
