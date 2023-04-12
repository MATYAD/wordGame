package WelcomeWindow;

import javax.swing.*;
import java.awt.*;

public class WelcomeFrame {
    JFrame frame = new JFrame();
    GameNameLabel gameNameLabel = new GameNameLabel();
    PlayButton playButton = new PlayButton();
    ModeButton modeButton = new ModeButton();
    GridSelectButton gridSelectButton = new GridSelectButton();
    PixelLettersLabel pixelLettersLabel = new PixelLettersLabel();
    ImageIcon logoImage = new ImageIcon("logo.jpg");

    public WelcomeFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Word Game");
        frame.setIconImage(logoImage.getImage());
        frame.setUndecorated(false);
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

    }



}
