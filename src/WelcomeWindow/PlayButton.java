package WelcomeWindow;

import GameWindow.GameFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButton extends JButton implements ActionListener {
    WelcomeFrame frame;

    public PlayButton(WelcomeFrame frame) {
        this.frame = frame;
        this.addActionListener(this::actionPerformed);
        this.setFocusable(false);
        this.setText("PLAY");
        this.setVerticalAlignment(JButton.CENTER);
        this.setHorizontalAlignment(JButton.CENTER);
        this.setBackground(Color.BLACK);
        //this.setContentAreaFilled(false);
        this.setBorder(BorderFactory.createLineBorder(Color.ORANGE,3));
        this.setFont(new Font("Didot", Font.BOLD, 30));
        this.setForeground(Color.ORANGE);
        this.setBounds(500,290,200,100);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this){
            frame.getFrame().dispose();
            GameFrame gameFrame = new GameFrame();

        }

    }
}
