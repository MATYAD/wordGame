package WelcomeWindow.GridWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grid1Button extends JButton implements ActionListener {

    GridFrame frame;

    public Grid1Button(GridFrame frame) {
        this.frame = frame;
        this.addActionListener(this);
        this.setFocusable(false);
        this.setText("3x3");
        this.setVerticalAlignment(JButton.CENTER);
        this.setHorizontalAlignment(JButton.CENTER);
        this.setBackground(Color.BLACK);
        //this.setContentAreaFilled(false);
        this.setBorder(BorderFactory.createLineBorder(Color.ORANGE,3));
        this.setFont(new Font("Didot", Font.BOLD, 30));
        this.setForeground(Color.ORANGE);
        this.setBounds(40,300,100,50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this){
            frame.getFrame().dispose();
            int grid = 0;
        }

    }
}
