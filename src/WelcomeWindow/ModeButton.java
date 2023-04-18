package WelcomeWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModeButton extends JButton implements ActionListener {
    public ModeButton() {
        this.addActionListener(this);
        this.setFocusable(false);
        this.setText("MODE");
        this.setVerticalAlignment(JButton.CENTER);
        this.setHorizontalAlignment(JButton.CENTER);
        this.setBackground(Color.BLACK);
        //this.setContentAreaFilled(false);
        this.setBorder(BorderFactory.createLineBorder(Color.ORANGE,3));
        this.setFont(new Font("Didot", Font.BOLD, 30));
        this.setForeground(Color.ORANGE);
        this.setBounds(500,410,200,100);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
