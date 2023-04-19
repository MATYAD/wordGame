package WelcomeWindow;

import GameWindow.GameFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeFrame {
    JFrame frame = new JFrame();
    GameNameLabel gameNameLabel = new GameNameLabel();
    PlayButton playButton = new PlayButton(this);
    ModeButton modeButton = new ModeButton();
    GridSelectButton gridSelectButton = new GridSelectButton();
    PixelLettersLabel pixelLettersLabel = new PixelLettersLabel();
    ExitButton exitButton = new ExitButton();
    CurrentTimeLabel currentTimeLabel = new CurrentTimeLabel();

    ImageIcon logoImage = new ImageIcon("logo.jpg");

    public WelcomeFrame() throws InterruptedException {
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

        
        frame.add(gameNameLabel);
        frame.add(playButton);
        frame.add(modeButton);
        frame.add(gridSelectButton);
        frame.add(pixelLettersLabel.labelN);
        frame.add(pixelLettersLabel.labelE);
        frame.add(pixelLettersLabel.labelL);
        frame.add(pixelLettersLabel.labelA);
        frame.add(exitButton);
        frame.add(currentTimeLabel);
        currentTimeLabel.setTime();


    }

    public JFrame getFrame() {
        return frame;
    }
}
