package GameWindow;

import GameWindow.GridPanels.BoardPanel3x3;
import WelcomeWindow.ExitButton;

import javax.swing.*;
import java.awt.*;

public class GameFrame {
    JFrame frame = new JFrame();
    TimeLabel timeLabel = new TimeLabel();
    ExitButton exitButton  = new ExitButton();
    BoardPanel3x3 boardPanel3x3 = new BoardPanel3x3();
    ImageIcon logoImage = new ImageIcon("logo.jpg");
    public GameFrame(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Word Game");
        frame.setIconImage(logoImage.getImage());
        frame.setUndecorated(true);
        frame.getRootPane().setBorder(BorderFactory.createLineBorder(Color.ORANGE,5));
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setLayout(null);
        frame.setSize(1200,800);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        frame.add(timeLabel);
        frame.add(boardPanel3x3);
        frame.add(exitButton);

    }
}
