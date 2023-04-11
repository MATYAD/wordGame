package WelcomeWindow;

import javax.swing.*;
import java.awt.*;

public class WelcomeFrame {
    JFrame frame = new JFrame();
    GameNameLabel gameNameLabel = new GameNameLabel();
    ImageIcon logoImage = new ImageIcon("logo.jpg");

    public WelcomeFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Word Game");
        frame.setIconImage(logoImage.getImage());
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setLayout(null);
        frame.setSize(1200,800);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(gameNameLabel);

    }



}
