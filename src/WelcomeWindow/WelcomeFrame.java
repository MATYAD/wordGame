package WelcomeWindow;

import GameWindow.GameFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeFrame implements ActionListener {
    JFrame frame = new JFrame();
    GameNameLabel gameNameLabel = new GameNameLabel();
    JButton button = new JButton();
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
        
        button.addActionListener(this::actionPerformed);
        button.setFocusable(false);
        button.setText("PLAY");
        button.setVerticalAlignment(JButton.CENTER);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setBackground(Color.BLACK);
        //button.setContentAreaFilled(false);
        button.setBorder(BorderFactory.createLineBorder(Color.ORANGE,3));
        button.setFont(new Font("Didot", Font.BOLD, 30));
        button.setForeground(Color.ORANGE);
        button.setBounds(500,290,200,100);
        
        frame.add(gameNameLabel);
        frame.add(button);
        frame.add(modeButton);
        frame.add(gridSelectButton);
        frame.add(pixelLettersLabel.labelN);
        frame.add(pixelLettersLabel.labelE);
        frame.add(pixelLettersLabel.labelL);
        frame.add(pixelLettersLabel.labelA);
        frame.add(exitButton);
        
        //frame.add(currentTimeLabel);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            frame.dispose();
            GameFrame gameFrame= new GameFrame();
        }

    }
}
