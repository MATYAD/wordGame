package GameWindow;


import WelcomeWindow.ExitButton;
import WelcomeWindow.GridWindow.SetButton;

import javax.swing.*;
import java.awt.*;

public class GameFrame {
    JFrame frame = new JFrame();
    TimeLabel timeLabel = new TimeLabel();
    ExitButton exitButton  = new ExitButton();
    private JButton[] buttons;
    SetButton setButton;

    ImageIcon logoImage = new ImageIcon("logo.jpg");
    public GameFrame(SetButton setButton) {
        this.setButton = setButton;
        int numButtons = setButton.getXSize() * setButton.getYSize();
        buttons = new JButton[numButtons];

        for (int i = 0; i < numButtons; i++){
            buttons[i] = new JButton("Button " + (i+1));
            frame.add(buttons[i]);

        }
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
        frame.add(exitButton);

    }

    public final void getFrame() {
        GameFrame gameFrame = new GameFrame(setButton);

    }
}
